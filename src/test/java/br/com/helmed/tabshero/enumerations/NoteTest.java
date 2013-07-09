package br.com.helmed.tabshero.enumerations;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

/**
 * User: helmed
 * Date: 7/8/13
 * Time: 9:31 PM
 */
public class NoteTest {
    @Test public void shouldReturnNullWhenNoNoteWasFound() throws Exception {
        assertNull(Note.byItsLetter("W"));
    }

    @Test public void shouldReturnTheDONoteWhenCIsInformed() throws Exception {
        assertEquals(Note.DO, Note.byItsLetter("C"));
    }

    @Test public void shouldReturnTheDOSHARPNoteWhenCSHARPIsInformed() throws Exception {
        assertEquals(Note.DO_SHARP, Note.byItsLetter("C#"));
    }

    @Test public void shouldReturnTheRENoteWhenDIsInformed() throws Exception {
        assertEquals(Note.RE, Note.byItsLetter("D"));
    }

    @Test public void shouldReturnTheRESHARPNoteWhenDSHARPIsInformed() throws Exception {
        assertEquals(Note.RE_SHARP, Note.byItsLetter("D#"));
    }

    @Test public void shouldReturnTheMINoteWhenEIsInformed() throws Exception {
        assertEquals(Note.MI, Note.byItsLetter("E"));
    }
}
