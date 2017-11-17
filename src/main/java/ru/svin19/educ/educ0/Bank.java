//package ru.duchanov.educ;
//
//import java.util.List;
//
//public class Bank {
//    private final TransactionService transactionService;
//    private final BalanceService balanceService;
//
//    public Bank(TransactionService transactionService) {
//        this.transactionService = transactionService;
//    }
//
//    public Lict<Transaction> getTransactions(Person person) {
//        if (transactionService.getTransactionRequestCount(Person.getId()) == 5) {
//
//            return emptyList();
//        }
//        List<Transaction> transactions = transactionService.getTransactions(person.getId, 10);
//        transactionService.incrementTransactionReqCount();
//        return transactions;
//
//    }
//
//}
