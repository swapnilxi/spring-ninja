package com.swapnilxi.bookingapi.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.swapnilxi.bookingapi.entity.Transaction;
import com.swapnilxi.bookingapi.service.TranService;

@RestController
@RequestMapping("/bookingservice/transaction")
public class TransactionController {
  @Autowired
  TranService transactionService;

  @PostMapping
  public Transaction save(@RequestBody Transaction transaction) {
    return transactionService.save(transaction);
  }

  @GetMapping
  public List<Transaction> getAllTransactions() {
    return transactionService.getAllTransactions();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Transaction> getTranByID(@PathVariable Integer id) {
    Transaction transaction = transactionService.getTransactionById(id);
    return new ResponseEntity<>(transaction, HttpStatus.OK);
  }

  @PutMapping("/{id}")
  public Transaction updateTransaction(@PathVariable Integer id, @RequestBody Transaction updatedTransaction) {
    return transactionService.updateTransaction(id, updatedTransaction);
  }

}
