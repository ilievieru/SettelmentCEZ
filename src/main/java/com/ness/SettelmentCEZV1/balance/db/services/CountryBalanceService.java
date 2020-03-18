package com.ness.SettelmentCEZV1.balance.db.services;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalance;
import com.ness.SettelmentCEZV1.balance.db.repositories.CountryBalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryBalanceService {

    @Autowired
    private CountryBalanceRepo countryBalanceRepo;

    public CountryBalance save(CountryBalance countryBalance) {
        return countryBalanceRepo.save(countryBalance);
    }

    public List<CountryBalance> save (List<CountryBalance> countryBalances){
        for (CountryBalance countryBalance : countryBalances)
            countryBalanceRepo.save(countryBalance);
        return countryBalances;
    }

    public void deleteAll(){
        countryBalanceRepo.deleteAll();
    }

}
