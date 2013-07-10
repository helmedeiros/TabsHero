package br.com.helmed.tabshero.business;

import br.com.helmed.tabshero.domain.Guitar;
import br.com.helmed.tabshero.domain.Neck;
import br.com.helmed.tabshero.domain.NilonString;
import br.com.helmed.tabshero.enumerations.NeckType;
import br.com.helmed.tabshero.enumerations.Note;
import br.com.helmed.tabshero.util.FileReaderUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: helmed
 * Date: 7/9/13
 * Time: 5:57 PM
 */
public class TabReaderBO {
    private Guitar guitar;

    public TabReaderBO() {
        Neck neck = new Neck(NeckType.FRETTED, 18);
        guitar = new Guitar(neck);

        List<NilonString> strings = new ArrayList<NilonString>();
        strings.add(new NilonString(Note.MI));
        strings.add(new NilonString(Note.SI));
        strings.add(new NilonString(Note.SOL));
        strings.add(new NilonString(Note.RE));
        strings.add(new NilonString(Note.LA));
        strings.add(new NilonString(Note.MI));
        guitar.setStrings(strings);
    }

    public Map<NilonString, List<Note>> readTab(final String tabName) {
        Map<NilonString, List<Note>> readTablature = null;

        try {
            final String tabAsString = FileReaderUtil.readFileAsString(tabName);
            readTablature = readEachString(tabAsString);
        } catch (IOException e) {
            e.printStackTrace();
        }



        return readTablature;
    }

    private Map<NilonString, List<Note>> readEachString(final String tablature) {
        Map<NilonString, List<Note>> readTablature = new HashMap<NilonString, List<Note>>();

        for (NilonString string : guitar.getStrings()) {
            String[] notesAndPositions = readStringPlayingOrder(string, tablature);
            for( int i = 0; i<notesAndPositions.length; i++){
                //TODO pegar as posicoes e armazenar
            }

            //TODO pegar a lista final de repeticoes e notas readTablature.putAll(string, );

        }

        return readTablature;
    }

    private String[] readStringPlayingOrder(NilonString string, String tabAsString) {
        List<String> linesToPlay = findStringTabs(string, tabAsString);

        StringBuffer completeStringTab = groupStringTabs(linesToPlay);

        return completeStringTab.toString().split(".");
    }

    private StringBuffer groupStringTabs(List<String> linesToPlay) {
        StringBuffer completeStringTab = new StringBuffer();
        for (String lineToPlay : linesToPlay) {
            completeStringTab.append(lineToPlay);
        }
        return completeStringTab;
    }

    private List<String> findStringTabs(NilonString string, String tabAsString) {
        final String regex = string.getTune().getLetter()+"[^\\n]*";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(tabAsString);

        List<String> linesToPlay = new ArrayList<String>();
        while(matcher.find()){
            final int start = matcher.start();
            final int end = matcher.end();
            linesToPlay.add(tabAsString.substring(start, end));
        }
        return linesToPlay;
    }

    public Guitar getGuitar() { return guitar; }
}
