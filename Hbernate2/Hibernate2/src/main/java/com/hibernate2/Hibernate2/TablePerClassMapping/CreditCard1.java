package com.hibernate2.Hibernate2.TablePerClassMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class CreditCard1 extends Payment1 {
    private String credit_card;

    public String getCredit_card() {
        return credit_card;
    }

    public void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }
}

