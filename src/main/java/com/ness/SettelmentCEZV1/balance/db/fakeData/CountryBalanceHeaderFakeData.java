package com.ness.SettelmentCEZV1.balance.db.fakeData;

import com.ness.SettelmentCEZV1.balance.db.calculation.CountryBalanceHeaderCalculation;
import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceHeader;

public class CountryBalanceHeaderFakeData {
    CountryBalanceFakeData countryBalanceFakeData = new CountryBalanceFakeData();
    CountryBalanceHeaderCalculation countryBalanceHeaderCalculation =  new CountryBalanceHeaderCalculation();

    public CountryBalanceHeader fakeData1() {
        CountryBalanceHeader countryBalanceHeader = new CountryBalanceHeader();
        countryBalanceHeader.setDirection("CPT-Dolj");
        countryBalanceHeader.setMonth(8);
        countryBalanceHeader.setYear(2019);
        countryBalanceHeader.setIndex("1");
        countryBalanceHeader.setSpecification("Din centrale el., din care:");
        countryBalanceHeader.setUnitOfMeasure("kWh");
        countryBalanceHeader.setCountryBalances(countryBalanceFakeData.fakeData1());
        countryBalanceHeaderCalculation.createTotalLine(countryBalanceHeader);

        return countryBalanceHeader;
    }
}
