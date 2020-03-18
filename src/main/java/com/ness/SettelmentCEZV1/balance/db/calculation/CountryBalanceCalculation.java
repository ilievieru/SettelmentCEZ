package com.ness.SettelmentCEZV1.balance.db.calculation;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalance;

public class CountryBalanceCalculation {

    public void initialCalculation(CountryBalance countryBalance) {
        countryBalance.setTotal(countryBalance.getLea() + countryBalance.getTrafo() + countryBalance.getLeaMT() + countryBalance.getTrafoMT() + countryBalance.getLeaJT());
    }


}
