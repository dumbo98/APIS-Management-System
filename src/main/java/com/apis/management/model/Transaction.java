package com.apis.management.model;

/**
 * Created by scottkim on 1/16/17.
 */
public class Transaction {
    private TransactionType type;
    private String comment;

    public Transaction(TransactionType type, String comment) {
        this.type = type;
        this.comment = comment;
    }

    public enum TransactionType {

    }
}
