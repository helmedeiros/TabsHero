package br.com.helmed.tabshero.domain;

import br.com.helmed.tabshero.enumerations.Note;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test of {@link NilonString}
 * User: helmed
 * Date: 7/8/13
 * Time: 11:32 PM
 */
public class NilonStringTest {
    @Test public void allStringsShouldHaveATune() throws Exception {
        assertNotNull("The String should have a tune",new NilonString(Note.MI).getTune());
    }
}
