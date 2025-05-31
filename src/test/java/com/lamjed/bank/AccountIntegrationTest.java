package com.lamjed.bank;

import org.junit.jupiter.api.*;

class AccountIntegrationTest {

    @Test
    void shouldPrintStatementContainingAllTransactions() {
        TransactionRepository repository = new TransactionRepository();
        StatementPrinter printer = new StatementPrinter();
        Account account = new Account(repository, printer);

        account.deposit(1000);
        account.withdraw(200);
        account.deposit(500);

        account.printStatement();
    }
}