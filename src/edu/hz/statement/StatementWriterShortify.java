package edu.hz.statement;

import java.util.ArrayList;
import java.util.List;

public class StatementWriterShortify extends AbstractStatementWriter{

    public StatementWriterShortify(StatementWriter _statementWriter) {
        super(_statementWriter);
    }

    private List<String> splitIntoMultipleSentences(String sentence) {

        List<String> res = new ArrayList<String>();
        String[] shortSentences = sentence.split("[.,]");

        for(String shortSentence : shortSentences) {
            String capitalizedShortSentence = shortSentence.substring(0,1).toUpperCase()
                    + shortSentence.substring(1).toLowerCase() + ".";

            res.add(capitalizedShortSentence);
        }

        return res;
    }

    @Override
    public String[] getStatements() {

        List<String> res = new ArrayList<String>();
        String[] stats = this._statementWriter.getStatements();

        for(String stat : stats) {
            List<String> shorted = this.splitIntoMultipleSentences(stat);
            res.addAll(shorted);
        }

        return res.toArray(new String[0]);
    }
}
