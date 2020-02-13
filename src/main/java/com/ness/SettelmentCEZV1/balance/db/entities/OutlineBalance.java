package com.ness.SettelmentCEZV1.balance.db.entities;

import javax.persistence.*;

@Entity
@Table(schema = "SettelmentCEZ")
public class OutlineBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String indexLetter;
    private String name;
    private String unitOfMeasure;
    private double valueIT;
    private double valueMT;
    private double valueJT;
    private double totalContourDistribution;

    @ManyToOne
    @JoinColumn(name = "outline_balance_header_id")
    private OutlineBalanceHeader outlineBalanceHeader;

    public void setIndexLetter(String indexLetter) {
        this.indexLetter = indexLetter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setValueIT(double valueIT) {
        this.valueIT = valueIT;
    }

    public void setValueMT(double valueMT) {
        this.valueMT = valueMT;
    }

    public void setValueJT(double valueJT) {
        this.valueJT = valueJT;
    }

    public void setTotalContourDistribution(double totalContourDistribution) {
        this.totalContourDistribution = totalContourDistribution;
    }

    public String getIndexLetter() {
        return indexLetter;
    }

    public String getName() {
        return name;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public double getValueIT() {
        return valueIT;
    }

    public double getValueMT() {
        return valueMT;
    }

    public double getValueJT() {
        return valueJT;
    }

    public double getTotalContourDistribution() {
        return totalContourDistribution;
    }
}
