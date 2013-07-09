package br.com.helmed.tabshero.enumerations;

import java.util.Arrays;
import java.util.List;

/**
 * User: helmed
 * Date: 7/8/13
 * Time: 10:17 PM
 */
public enum Scale {
    //Dó - Dó# - Ré - Ré# - Mi - Fá - Fá# - Sol - Sol# - Lá - Lá# - Si
    Chromatic(Note.DO, Note.DO_SHARP);

    private List<Note> allNotes;

    Scale(Note... notes) {
        this.allNotes = Arrays.asList(notes);
    }

    private List<Note> getAllNotes() {
        return this.allNotes;
    }

    /**
     * find and return the {@link Note} existing in the gave position.
     * @param position - The position from the wanted {@link Note}.
     * @return the {@link Note} when the position is valid.
     */
    public Note getNote(final int position) {
        return this.getAllNotes().get(position-1);
    }
}
