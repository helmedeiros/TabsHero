package br.com.helmed.tabshero.enumerations;

/**
 * User: helmed
 * Date: 7/8/13
 * Time: 9:11 PM
 */
public enum Note {
    DO("C"), DO_SHARP("C#"), RE("D"), RE_SHARP("D#"), MI("E"), FA("F"), FA_SHARP("F#"), SOL("G"), SOL_SHARP("G#");

    private final String letter;

    private Note(final String letter) {
        this.letter = letter;
    }

    public static Note byItsLetter(final String letter){

        for (Note note : Note.values()) {
            if(note.letter.equals(letter)) return note;
        }

        return null;
    }

}
