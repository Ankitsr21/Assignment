package com.hibernate2.Hibernate2.SingleTableMapping;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("dc")
public class DebitCard extends Payment{
    private String debitCard;

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }
}
