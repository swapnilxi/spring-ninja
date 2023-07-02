package com.swapnilxi.bookingapi.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.lang.Double;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swapnilxi.bookingapi.entity.Transaction;
import com.swapnilxi.bookingapi.repository.TransRepo;

@Service
public class TranServiceImpl implements TranService {
    @Autowired
    TransRepo transRepo;

    @Override
    public Transaction getTransactionById(Integer id) {
        return transRepo.findById(id).orElse(null);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transRepo.findAll();
    }

    @Override
    public Transaction save(Transaction transaction) {
        return transRepo.save(transaction);
    }

    @Override
    public Transaction updateTransaction(Integer id, Transaction updatedTransaction) {
        Transaction transaction = transRepo.findById(id).orElse(null);
        if (transaction != null) {
            transaction.setType(updatedTransaction.getType());
            transaction.setAmount(updatedTransaction.getAmount());
            transaction.setCurrency(updatedTransaction.getCurrency());
            transaction.setParent_id(updatedTransaction.getParent_id());
            return transRepo.save(transaction);
        } else {
            return null;
        }
    }

    @Override
    public Set<String> getUniqueCurrencies() {
        List<Transaction> allTransactions = transRepo.findAll();
        return allTransactions.stream()
                .map(Transaction::getCurrency)
                .collect(Collectors.toSet());
    }

    @Override
    public List<Transaction> getTransactionIdsByType(String type) {
        return transRepo.findAll().stream()
                .filter(transaction -> transaction.getType().equalsIgnoreCase(type))
                // .mapToInt(Transaction::getTransaction_id)
                // .boxed()
                .collect(Collectors.toList());
    }

    @Override
    public Double getSumByTransactionId(int transaction_id) {
        Optional<Transaction> optionalTransaction = transRepo.findById(transaction_id);

        if (optionalTransaction.isPresent()) {
            Transaction transaction = optionalTransaction.get();
            String currencyType = transaction.getCurrency();

            double sum = transRepo.findAll()
                    .stream()
                    .filter(t -> t.getCurrency().equals(currencyType))
                    .mapToDouble(Transaction::getAmount)
                    .sum();

            return sum;
        }

        // throw new TransactionNotFoundException("Transaction not found with ID: " +
        // transaction_id);
        return null;
    }
}
