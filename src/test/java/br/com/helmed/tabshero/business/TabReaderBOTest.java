package br.com.helmed.tabshero.business;

import br.com.helmed.tabshero.domain.NilonString;
import br.com.helmed.tabshero.enumerations.Note;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * User: helmed
 * Date: 7/9/13
 * Time: 6:00 PM
 */
public class TabReaderBOTest {
    private TabReaderBO tabReaderBO;

    @Before public void setUp() throws Exception {
        tabReaderBO = new TabReaderBO();
    }

    @Test public void shouldReturn2InTheMIString() throws Exception {
        final Map<NilonString,List<Note>> nilonStringListMap = tabReaderBO.readTab("MIwith2.txt");

        assertEquals(Note.FA_SHARP, nilonStringListMap.get(tabReaderBO.getGuitar().getStrings().get(0)).get(0));
    }
}
