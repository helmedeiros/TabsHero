package br.com.helmed.tabshero.enumerations;

/**
 * A sign used in musical notation to represent the relative duration and pitch of a sound;
 * User: helmed
 * Date: 7/8/13
 * Time: 9:11 PM
 */
public enum Note {
    DO("C"), DO_SHARP("C#"), RE("D"), RE_SHARP("D#"), MI("E"), FA("F"), FA_SHARP("F#"), SOL("G"), SOL_SHARP("G#"), LA("A"), LA_SHARP("A#"), SI("B");

    private final String letter;

    private Note(final String letter) {
        this.letter = letter;
    }

    /**
     * Find and return for a the given {@link String} letter, the correspondent music {@link Note}.
     * @param letter - The given {@link String} from is wanted the {@link Note}.
     * @return the {@link Note} or null when nothing was found.
     */
    public static Note byItsLetter(final String letter){

        for (Note note : Note.values()) {
            if(note.letter.equals(letter)) return note;
        }

        return null;
    }

}
