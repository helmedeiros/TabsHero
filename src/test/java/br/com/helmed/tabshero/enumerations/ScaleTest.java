package br.com.helmed.tabshero.enumerations;

import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.junit.Assert.assertEquals;

/**
 * Unit test of {@link Scale}
 * User: helmed
 * Date: 7/8/13
 * Time: 10:17 PM
 */
public class ScaleTest {

    private static final int FIRST = 1;
    private static final int SECOND = 2;
    private static final int THIRD = 3;
    private static final int FOURTH = 4;
    private static final int FIFTH = 5;
    private static final int SIXTH = 6;
    private static final int SEVENTH = 7;
    private static final int EIGHTH = 8;

    @Test public void shouldReturnNullWhenTheNotePositionsDoesntExistInTheScale() throws Exception {
        assertNull(Scale.Chromatic.getNote(16));
    }

    @Test public void shouldReturnTheDOAsTheFirstNoteFromChromaticScale() throws Exception {
        assertEquals(Note.DO, Scale.Chromatic.getNote(FIRST));
    }

    @Test public void shouldReturnTheDOSHARPAsTheSecondNoteFromChromaticScale() throws Exception {
        assertEquals(Note.DO_SHARP, Scale.Chromatic.getNote(SECOND));
    }

    @Test public void shouldReturnTheREPAsTheThirdNoteFromChromaticScale() throws Exception {
        assertEquals(Note.RE, Scale.Chromatic.getNote(THIRD));
    }

    @Test public void shouldReturnTheRESHARPPAsTheFourthNoteFromChromaticScale() throws Exception {
        assertEquals(Note.RE_SHARP, Scale.Chromatic.getNote(FOURTH));
    }

    @Test public void shouldReturnTheMIAsTheFifthNoteFromChromaticScale() throws Exception {
        assertEquals(Note.MI, Scale.Chromatic.getNote(FIFTH));
    }

    @Test public void shouldReturnTheFAAsTheSixthNoteFromChromaticScale() throws Exception {
        assertEquals(Note.FA, Scale.Chromatic.getNote(SIXTH));
    }

    @Test public void shouldReturnTheFASHARPAsTheSeventhNoteFromChromaticScale() throws Exception {
        assertEquals(Note.FA_SHARP, Scale.Chromatic.getNote(SEVENTH));
    }

    @Test public void shouldReturnTheSOLAsTheEighthNoteFromChromaticScale() throws Exception {
        assertEquals(Note.SOL, Scale.Chromatic.getNote(EIGHTH));
    }


}
