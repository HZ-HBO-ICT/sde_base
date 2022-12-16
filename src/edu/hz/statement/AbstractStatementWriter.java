package edu.hz.statement;

public abstract class  AbstractStatementWriter implements StatementWriter {

    protected StatementWriter _statementWriter;

    public AbstractStatementWriter(StatementWriter _statementWriter) {
        this._statementWriter = _statementWriter;
    }
}
