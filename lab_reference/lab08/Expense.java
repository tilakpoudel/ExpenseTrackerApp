package com.example.sscexpensetracker.lab08;

/**
 * Lab 8 Reference Model: Unit 6 - RecyclerView Data Model.
 */
public class Expense {
    private String title;
    private double amount;
    private String category;

    public Expense(String title, double amount, String category) {
        this.title = title;
        this.amount = amount;
        this.category = category;
    }

    public String getTitle() { return title; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }
}
