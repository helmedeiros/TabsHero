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
    Chromatic(Note.DO);

    private List<Note> allNotes;

    Scale(Note... notes) {
        this.allNotes = Arrays.asList(notes);
    }

    public List<Note> getAllNotes() {
        return this.allNotes;
    }
}
