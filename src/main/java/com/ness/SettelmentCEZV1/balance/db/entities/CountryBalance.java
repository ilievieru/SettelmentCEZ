package com.ness.SettelmentCEZV1.balance.db.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "SettelmentCEZ")
@Inheritance(strategy = InheritanceType.JOINED)
public class CountryBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String index;
    private String specification;
    private String unitOfMeasure;

    private double lea;
    private double trafo;
    private double leaMT;
    private double trafoMT;
    private double leaJT;
    private double total;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_balance_id")
    private List<CountryBalanceDetail> countryBalanceDetails;

    @ManyToOne
    @JoinColumn(name = "country_balance_header_id")
    private CountryBalanceHeader countryBalanceHeader;

    public Long getId() {
        return id;
    }

    public String getIndex() {
        return index;
    }

    public String getSpecification() {
        return specification;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public double getLea() {
        return lea;
    }

    public double getTrafo() {
        return trafo;
    }

    public double getLeaMT() {
        return leaMT;
    }

    public double getTrafoMT() {
        return trafoMT;
    }

    public double getLeaJT() {
        return leaJT;
    }

    public double getTotal() {
        return total;
    }

    protected List<CountryBalanceDetail> getCountryBalanceDetails() {
        return countryBalanceDetails;
    }

    protected CountryBalanceHeader getCountryBalanceHeader() {
        return countryBalanceHeader;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public void setLea(double lea) {
        this.lea = lea;
    }

    public void setTrafo(double trafo) {
        this.trafo = trafo;
    }

    public void setLeaMT(double leaMT) {
        this.leaMT = leaMT;
    }

    public void setTrafoMT(double trafoMT) {
        this.trafoMT = trafoMT;
    }

    public void setLeaJT(double leaJT) {
        this.leaJT = leaJT;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCountryBalanceDetails(List<CountryBalanceDetail> countryBalanceDetails) {
        this.countryBalanceDetails = countryBalanceDetails;
    }

    protected void setCountryBalanceHeader(CountryBalanceHeader countryBalanceHeader) {
        this.countryBalanceHeader = countryBalanceHeader;
    }
}
