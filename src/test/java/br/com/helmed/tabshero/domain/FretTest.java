package br.com.helmed.tabshero.domain;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;

/**
 * Unit test of {@link Fret}
 * User: helmed
 * Date: 7/8/13
 * Time: 11:46 PM
 */
public class FretTest {

    public static final int UNKNOWN_POSITION = 0;
    public static final int FIRST_POSITION = 1;

    @Test public void allFretsShouldHaveOnePositionOrder() throws Exception {
        assertNotSame("The fret should know its position", UNKNOWN_POSITION, new Fret(FIRST_POSITION).getPosition());
    }
}
