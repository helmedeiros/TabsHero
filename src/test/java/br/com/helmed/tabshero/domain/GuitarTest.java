package br.com.helmed.tabshero.domain;

import br.com.helmed.tabshero.enumerations.NeckType;
import br.com.helmed.tabshero.enumerations.Note;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Unit test of a {@link Guitar}
 * User: helmed
 * Date: 7/9/13
 * Time: 12:17 AM
 */
public class GuitarTest {
    Neck neck;
    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        neck = new Neck(NeckType.FRETTED, 12);
        guitar = new Guitar(neck);
    }

    @Test public void aGuitarShouldAlwaysHaveANeck() throws Exception {
        assertNotNull("A guitar should have a neck", guitar.getNeck());
    }

    @Test public void aGuitarShouldSometimesHasStrings() throws Exception {
        assertNull(guitar.getStrings());
        List<NilonString> strings = new ArrayList<NilonString>();
        strings.add(new NilonString(Note.MI));
        strings.add(new NilonString(Note.SI));

        guitar.setStrings(strings);
        assertNotNull(guitar.getStrings());
    }
}
