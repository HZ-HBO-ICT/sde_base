package edu.hz.statement;

import java.util.ArrayList;
import java.util.List;

public class StatementWriterPolitify extends AbstractStatementWriter {

    private int _distributionKey;

    private String[] polites = new String[] {
            "Please know that ",
            "Be informed that ",
            "As a consequence ",
            "Nevertheless ",
            "It comes as no surprise that "};

    public StatementWriterPolitify(StatementWriter _statementWriter) {
        super(_statementWriter);
    }

    private String getNextPrefix() {

        this._distributionKey++;
        int index = this._distributionKey % this.polites.length;

        return polites[index];
    }


    @Override
    public String[] getStatements() {

        List<String> res = new ArrayList<String>();
        String[] stats = this._statementWriter.getStatements();

        for(String stat : stats) {

                // lowercase the original sentence
                String statlow = Character.toLowerCase(stat.charAt(0))
                        + stat.substring(1);

                String polited = this.getNextPrefix() + statlow;

                res.add(polited);
        }

        return res.toArray(new String[0]);
    }
}
