package com.lamjed.bank;
import java.util.List;

public class StatementPrinter {
    public void print(List<Transaction> transactions) {
        System.out.println("DATE | AMOUNT | BALANCE");
        for (Transaction tx : transactions) {
            System.out.printf("%s | %d | %d%n",
                    tx.getDate(),
                    tx.getAmount(),
                    tx.getBalance());
        }
    }
}
