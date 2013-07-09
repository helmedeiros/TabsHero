package br.com.helmed.tabshero.enumerations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test of {@link Scale}
 * User: helmed
 * Date: 7/8/13
 * Time: 10:17 PM
 */
public class ScaleTest {
    @Test
    public void shouldReturnTheDOAsTheFirstNoteFromChromaticScale() throws Exception {
        assertEquals(Note.DO, Scale.Chromatic.getAllNotes().get(0));
    }
}