package com.hibernate2.Hibernate2.JoinedMapping;

import jakarta.persistence.*;

@Entity
@Table(name = "paymentjoined")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payment_Joined {
    @Id
    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
