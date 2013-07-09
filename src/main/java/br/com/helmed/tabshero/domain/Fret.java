package br.com.helmed.tabshero.domain;

/**
 * Frets divide the neck into fixed segments at intervals related to a musical framework
 * User: helmed
 * Date: 7/8/13
 * Time: 11:23 PM
 */
public class Fret {
    private int position;

    public Fret(final int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }
}
