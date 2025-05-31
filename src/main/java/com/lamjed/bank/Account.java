package com.lamjed.bank;

public class Account {
    private final TransactionRepository transactionRepository;
    private final StatementPrinter statementPrinter;
    private int balance = 0;

    public Account(TransactionRepository transactionRepository, StatementPrinter statementPrinter) {
        this.transactionRepository = transactionRepository;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(int amount) {
        balance += amount;
        transactionRepository.addTransaction(amount, balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
        transactionRepository.addTransaction(-amount, balance);
    }

    public void printStatement() {
        statementPrinter.print(transactionRepository.getAllTransactions());
    }
}
