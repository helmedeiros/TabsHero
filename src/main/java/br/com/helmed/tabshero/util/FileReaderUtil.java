package br.com.helmed.tabshero.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * User: helmed
 * Date: 7/9/13
 * Time: 12:42 AM
 */
public class FileReaderUtil {
        /**
         * Auxiliar method to read files.
         * @param filePath - The {@link String} address from where the file should be read.
         * @return the {@link String} read from file.
         */
        public static String readFileAsString(String filePath) throws java.io.IOException {

            filePath = ClassLoader.getSystemResource(filePath).getFile();
            byte[] buffer = new byte[(int) new File(filePath).length()];
            BufferedInputStream f = null;
            try {
                f = new BufferedInputStream(new FileInputStream(filePath));
                f.read(buffer);
            } finally {
                if (f != null) try { f.close(); } catch (IOException ignored) { }
            }
            return new String(buffer);
        }
}
