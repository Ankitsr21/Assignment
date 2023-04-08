package com.hibernate2.Hibernate2.TablePerClassMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class DebitCard1 extends Payment1 {
    private String debit_card;

    public String getDebit_card() {
        return debit_card;
    }

    public void setDebit_card(String debit_card) {
        this.debit_card = debit_card;
    }
}

