package com.swapnilxi.bookingapi.service;

import java.util.List;
import java.util.Set;

import com.swapnilxi.bookingapi.entity.Transaction;

public interface TranService {
    public Transaction getTransactionById(Integer Id);

    public List<Transaction> getAllTransactions();

    public Transaction save(Transaction transaction);

    public Transaction updateTransaction(Integer id, Transaction updatedTransaction);

    public Set<String> getUniqueCurrencies();

    public List<Transaction> getTransactionIdsByType(String type);

    public Double getSumByTransactionId(int transaction_id);

}
