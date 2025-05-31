package com.lamjed.bank;

import java.time.LocalDate;
import java.util.*;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(int amount, int balance) {
        transactions.add(new Transaction(LocalDate.now(), amount, balance));
    }

    public List<Transaction> getAllTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}

