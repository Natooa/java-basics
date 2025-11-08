package org.nurdiyar.basic_connect_fron_back;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private static final List<Map<String, Object>> TRANSACTIONS = new ArrayList<>();

    static {
        TRANSACTIONS.add(Map.of("id", 1, "name", "Salary", "amount", 4500.0));
        TRANSACTIONS.add(Map.of("id", 2, "name", "Groceries", "amount", -1200.0));
    }

    @GetMapping
    public List<Map<String, Object>> getAll() {
        return TRANSACTIONS;
    }

    @PostMapping
    public Map<String, Object> addTransaction(@RequestBody Map<String, Object> newTx) {
        TRANSACTIONS.add(newTx);
        return newTx;
    }
}

