package com.ness.SettelmentCEZV1.balance.db.entities;

import javax.persistence.*;

@Entity
@Table(schema = "SettelmentCEZ")
public class CountryBalanceDetail extends CountryBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "country_balance_id")
    private CountryBalance countryBalance;


    public CountryBalance getCountryBalance() {
        return countryBalance;
    }

    public void setCountryBalance(CountryBalance countryBalance) {
        this.countryBalance = countryBalance;
    }
}
