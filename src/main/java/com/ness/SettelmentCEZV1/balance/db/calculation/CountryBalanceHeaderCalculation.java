package com.ness.SettelmentCEZV1.balance.db.calculation;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalance;
import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceHeader;

public class CountryBalanceHeaderCalculation {

    public CountryBalanceHeader createTotalLine(CountryBalanceHeader countryBalanceHeader) {
        if (countryBalanceHeader.getCountryBalances() != null) {
            for (CountryBalance countryBalance : countryBalanceHeader.getCountryBalances()) {
                countryBalanceHeader.setLea(countryBalanceHeader.getLea() + countryBalance.getLea());
                countryBalanceHeader.setTrafo(countryBalanceHeader.getTrafo() + countryBalance.getTrafo());
                countryBalanceHeader.setLeaMT(countryBalanceHeader.getLeaMT() + countryBalance.getLeaMT());
                countryBalanceHeader.setTrafoMT(countryBalanceHeader.getTrafoMT() + countryBalance.getTrafoMT());
                countryBalanceHeader.setLeaJT(countryBalanceHeader.getLeaJT() + countryBalance.getLeaJT());
            }
        }
        return countryBalanceHeader;

    }
}
