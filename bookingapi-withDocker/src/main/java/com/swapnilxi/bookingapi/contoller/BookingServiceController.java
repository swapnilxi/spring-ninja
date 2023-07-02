package com.swapnilxi.bookingapi.contoller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swapnilxi.bookingapi.entity.Transaction;
import com.swapnilxi.bookingapi.service.TranService;

@RestController
@RequestMapping("/bookingservice")
public class BookingServiceController {
    @Autowired
    TranService transactionService;

    @GetMapping("/")
    public String getBooking() {
        return "this is booking";
    }

    @GetMapping("/currencies")
    public Set<String> getCurrencies() {
        return transactionService.getUniqueCurrencies();
    }

    @GetMapping("/types/{type}")
    public List<Transaction> getTransactionIdsByType(@PathVariable String type) {
        return transactionService.getTransactionIdsByType(type);
    }

    @GetMapping("/sum/{transaction_id}")
    public Double getSumByTransactionId(@PathVariable int transaction_id) {
        return transactionService.getSumByTransactionId(transaction_id);
    }

}
