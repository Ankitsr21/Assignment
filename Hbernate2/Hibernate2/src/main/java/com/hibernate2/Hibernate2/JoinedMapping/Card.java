package com.hibernate2.Hibernate2.JoinedMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
public class Card extends Payment_Joined{
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}

