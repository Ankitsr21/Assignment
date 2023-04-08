package com.hibernate2.Hibernate2.JoinedMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "bankcheck")
@PrimaryKeyJoinColumn(name = "id")
public class BankCheck extends Payment_Joined{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
