package com.ness.SettelmentCEZV1.balance.db.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "SettelmentCEZ")
public class OutlineBalanceHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String distributionOperator;
    private int year;
    private int month;
    private String indexLetter;
    private String name;
    private String unitOfMeasure;
    private double totalIT;
    private double totalMT;
    private double totalJT;
    private double totalContourDistribution;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "outline_balance_header_id")
    List<OutlineBalance> outlineBalances;

    public void setDistributionOperator(String distributionOperator) {
        this.distributionOperator = distributionOperator;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setIndexLetter(String indexLetter) {
        this.indexLetter = indexLetter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setTotalIT(double totalIT) {
        this.totalIT = totalIT;
    }

    public void setTotalMT(double totalMT) {
        this.totalMT = totalMT;
    }

    public void setTotalJT(double totalJT) {
        this.totalJT = totalJT;
    }

    public void setTotalContourDistribution(double totalContourDistribution) {
        this.totalContourDistribution = totalContourDistribution;
    }

    public void setOutlineBalances(List<OutlineBalance> outlineBalances) {
        this.outlineBalances = outlineBalances;
    }

    public String getDistributionOperator() {
        return distributionOperator;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
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

    public double getTotalIT() {
        return totalIT;
    }

    public double getTotalMT() {
        return totalMT;
    }

    public double getTotalJT() {
        return totalJT;
    }

    public double getTotalContourDistribution() {
        return totalContourDistribution;
    }

    public List<OutlineBalance> getOutlineBalances() {
        return outlineBalances;
    }
}
