package com.ness.SettelmentCEZV1.balance.db.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "SettelmentCEZ")
public class CountryBalanceHeader extends CountryBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int month;
    private int year;
    private String direction;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_balance_header_id")
    private List<CountryBalance> countryBalances;


    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDirection() {
        return direction;
    }

    public List<CountryBalance> getCountryBalances() {
        return countryBalances;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setCountryBalances(List<CountryBalance> countryBalances) {
        this.countryBalances = countryBalances;
    }
}
