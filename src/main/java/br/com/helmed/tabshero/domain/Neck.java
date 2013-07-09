package br.com.helmed.tabshero.domain;

import br.com.helmed.tabshero.enumerations.NeckType;

import java.util.ArrayList;
import java.util.List;

/**
 * A guitar's frets, fretboard, tuners, headstock, and truss rod,
 * all attached to a long wooden extension, collectively constitute its neck
 * User: helmed
 * Date: 7/8/13
 * Time: 11:14 PM
 */
public class Neck {
    private NeckType type;
    private List<Fret> frets;

    public Neck(NeckType type) {
        this.type = type;
    }

    public Neck(NeckType type, int numberOfFrets) {
        this(type);

        frets = new ArrayList<Fret>();
        for (int i = 1; i <= numberOfFrets; i++) {
            frets.add(new Fret(i));
        }
    }

    public List<Fret> getFrets() { return frets; }

    public NeckType getType() { return type; }
}
