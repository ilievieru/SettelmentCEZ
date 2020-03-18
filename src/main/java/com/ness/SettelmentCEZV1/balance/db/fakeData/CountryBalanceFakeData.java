package com.ness.SettelmentCEZV1.balance.db.fakeData;

import com.ness.SettelmentCEZV1.balance.db.calculation.CountryBalanceCalculation;
import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalance;
import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceDetail;

import java.util.ArrayList;
import java.util.List;

public class CountryBalanceFakeData {

    private CountryBalanceCalculation countryBalanceCalculation = new CountryBalanceCalculation();

    public List<CountryBalance> fakeData1(){
        List<CountryBalance> countryBalances = new ArrayList<>();

        CountryBalance countryBalance = new CountryBalance();
        countryBalance.setIndex("1.1");
        countryBalance.setSpecification("Complexe Energetice Termo");
        countryBalance.setUnitOfMeasure("kWh");
        countryBalance.setLea(63282133);
        countryBalance.setTrafo(0);
        countryBalance.setLeaMT(0);
        countryBalance.setTrafoMT(0);
        countryBalance.setLeaJT(0);
        countryBalanceCalculation.initialCalculation(countryBalance);

        countryBalances.add(countryBalance);
        countryBalance = new CountryBalance();
        countryBalance.setIndex("1.2");
        countryBalance.setSpecification("Total energie hidro");
        countryBalance.setUnitOfMeasure("kWh");
        countryBalance.setLea(0);
        countryBalance.setTrafo(0);
        countryBalance.setLeaMT(0);
        countryBalance.setTrafoMT(0);
        countryBalance.setLeaJT(0);
        countryBalanceCalculation.initialCalculation(countryBalance);
        countryBalances.add(countryBalance);

        CountryBalanceDetail countryBalanceDetail = new CountryBalanceDetail();
        List<CountryBalanceDetail> countryBalanceDetails = new ArrayList<>();
        countryBalanceDetail.setIndex("1.2.1.");
        countryBalanceDetail.setSpecification("S.C. HIDROELECTRICA SA");
        countryBalanceDetail.setUnitOfMeasure("kWh");
        countryBalanceDetail.setLea(0);
        countryBalanceDetail.setTrafo(0);
        countryBalanceDetail.setLeaMT(0);
        countryBalanceDetail.setTrafoMT(0);
        countryBalanceDetail.setLeaJT(0);
        countryBalanceDetails.add(countryBalanceDetail);

        countryBalance.setCountryBalanceDetails(countryBalanceDetails);

        countryBalances.add(countryBalance);
        countryBalance = new CountryBalance();
        countryBalance.setIndex("1.3");
        countryBalance.setSpecification("Producatori independenti (CFV)");
        countryBalance.setUnitOfMeasure("kWh");
        countryBalance.setLea(0);
        countryBalance.setTrafo(0);
        countryBalance.setLeaMT(10233419);
        countryBalance.setTrafoMT(0);
        countryBalance.setLeaJT(47768);



        countryBalanceCalculation.initialCalculation(countryBalance);
        countryBalances.add(countryBalance);

       // countryBalances.add(countryBalanceCalculation.createTotalLine(countryBalances));

        return countryBalances;
    }
}
