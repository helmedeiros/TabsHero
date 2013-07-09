package br.com.helmed.tabshero.domain;

import br.com.helmed.tabshero.enumerations.Note;

/**
 * User: helmed
 * Date: 7/8/13
 * Time: 11:27 PM
 */
public class NilonString {
    private Note tune;

    public NilonString(final Note tune){
        this.tune = tune;
    }

    /**
     * Return the {@link Note} of the {@link NilonString}.
     * @return the {@link Note} that it was tuned.
     */
    public Note getTune() { return tune; }
}
