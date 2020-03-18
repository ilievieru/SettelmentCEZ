package com.ness.SettelmentCEZV1.balance.rest;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceHeader;
import com.ness.SettelmentCEZV1.balance.db.fakeData.CountryBalanceFakeData;
import com.ness.SettelmentCEZV1.balance.db.fakeData.CountryBalanceHeaderFakeData;
import com.ness.SettelmentCEZV1.balance.db.services.CountryBalanceHeaderService;
import com.ness.SettelmentCEZV1.balance.db.services.CountryBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CountryBalanceController {

    @Autowired
    private CountryBalanceService countryBalanceService;

    @Autowired
    private CountryBalanceHeaderService countryBalanceHeaderService;
    CountryBalanceFakeData countryBalanceFakeData = new CountryBalanceFakeData();
    CountryBalanceHeaderFakeData countryBalanceHeaderFakeData = new CountryBalanceHeaderFakeData();


    @GetMapping("/countryBalanceGenerate")
    public List<CountryBalanceHeader> generate() {
        List<CountryBalanceHeader> countryBalanceHeaders = new ArrayList<>();
        countryBalanceHeaderService.deleteAll();
        CountryBalanceHeader countryBalances = countryBalanceHeaderFakeData.fakeData1();
        countryBalanceHeaderService.save(countryBalances);
        countryBalanceHeaders.add(countryBalances);
        return countryBalanceHeaders;
    }

}
