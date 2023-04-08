package com.hibernate2.Hibernate2.ComponentMapping;

import jakarta.persistence.Embeddable;

@Embeddable
public class Salary {
    private float basicSalary;
    private float bonusSalary;
    private float taxAmount;
    private float specialAllowanceSalary;

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(float bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public float getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(float specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
