package org.example.repository;

import org.example.model.BankAccount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {
    private Map<Long, BankAccount> bankAccountMap = new HashMap<>();
    private long accountsCount = 0;
    @Override
    public BankAccount save(BankAccount bankAccount) {
        Long accountId=++accountsCount;
        bankAccount.setAccountId(accountId);
        bankAccountMap.put(accountId, bankAccount);
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long accountId) {
        BankAccount bankAccount = bankAccountMap.get(accountId);
        if (bankAccount == null) return Optional.empty();
        else return Optional.of(bankAccount);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.getAccountId(), bankAccount);
        return bankAccount;
    }

    @Override
    public void delete(Long accountId) {
        bankAccountMap.remove(accountId);
    }

    public void populateData(){
        for (int i = 0; i < 10; i++){
            BankAccount bankAccount;
        }
    }
}
