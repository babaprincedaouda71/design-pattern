package org.example.repository;

import org.example.model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class AccountRepositoryImpl implements AccountRepository {
    private Map<Long, BankAccount> longBankAccountMap = new HashMap<>();
    private int AccountsCount = 0;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        return null;
    }

    @Override
    public List<BankAccount> findAll() {
        return null;
    }

    @Override
    public Optional<BankAccount> findById(Long accountId) {
        return Optional.empty();
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return null;
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        return null;
    }

    @Override
    public void delete(Long AccountId) {

    }
}
