package br.com.helmed.tabshero.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test of {@link FileReaderUtil}
 * User: helmed
 * Date: 7/9/13
 * Time: 12:47 AM
 */
public class FileReaderUtilTest {
    @Test public void shouldReturnTheValueOfGivenFile() throws Exception {
        final String actual = FileReaderUtil.readFileAsString("tab.txt");

        assertEquals("E|-------------------------------------\n" +
                "B|-------------------------------------\n" +
                "G|------7---9b10---7-------7-----7-----\n" +
                "D|--9-9---9----------9-6-6---7-7-------\n" +
                "A|-------------------------------------\n" +
                "E|-------------------------------------", actual);
    }


}
