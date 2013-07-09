package br.com.helmed.tabshero.domain;

import br.com.helmed.tabshero.enumerations.NeckType;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test of {@link Neck}
 * User: helmed
 * Date: 7/8/13
 * Time: 11:54 PM
 */
public class NeckTest {

    public static final int NUMBER_OF_FRETS = 12;

    @Test public void aFrettedNeckShouldHaveAtLeastOneFret() throws Exception {
        final NeckType fretted = NeckType.FRETTED;
        final Neck neck = new Neck(fretted,NUMBER_OF_FRETS);

        assertEquals(fretted, neck.getType());
        assertNotNull(neck.getFrets());
    }

    @Test public void aFretlessNeckShouldntHaveFrets() throws Exception {
        final NeckType fretless = NeckType.FRETLESS;
        final Neck neck = new Neck(fretless);

        assertEquals(fretless, neck.getType());
        assertNull(neck.getFrets());
    }
}
