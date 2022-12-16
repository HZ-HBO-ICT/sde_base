package edu.hz;

import edu.hz.io.*;
import edu.hz.statement.HZMissionStatement;
import edu.hz.statement.StatementWriter;
import edu.hz.statement.StatementWriterShortify;

public class Main {

    public static void main(String[] args) {

        // define
        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        // execute
        StatementWriter graduateStatement = new HZMissionStatement();

        StatementWriter undergraduateStatement = new StatementWriterShortify(graduateStatement);



        writer.writeLines(undergraduateStatement.getStatements());
//        reader.readLine();

    }
}
