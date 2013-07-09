package br.com.helmed.tabshero.domain;

import java.util.List;

/**
 * Guitar is a string instrument of the chordophone family constructed from wood
 * and strung with either nylon or steel strings.
 * User: helmed
 * Date: 7/8/13
 * Time: 11:13 PM
 */
public class Guitar {
    private Neck neck;
    private List<NilonString> strings;

    public Guitar(Neck neck) {
        this.neck = neck;
    }

    public Neck getNeck() { return this.neck; }

    public List<NilonString> getStrings() { return this.strings; }

    public void setStrings(List<NilonString> strings) {
        this.strings = strings;
    }
}
