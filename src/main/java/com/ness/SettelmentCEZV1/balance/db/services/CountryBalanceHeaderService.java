package com.ness.SettelmentCEZV1.balance.db.services;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceHeader;
import com.ness.SettelmentCEZV1.balance.db.repositories.CountryBalanceHeaderRepo;
import com.ness.SettelmentCEZV1.balance.db.repositories.CountryBalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryBalanceHeaderService {

    @Autowired
    private CountryBalanceHeaderRepo countryBalanceHeaderRepo;
    @Autowired
    private CountryBalanceRepo countryBalanceRepo;

    public CountryBalanceHeader save(CountryBalanceHeader countryBalanceHeader){
        return countryBalanceHeaderRepo.save(countryBalanceHeader);
    }

    public void deleteAll(){
        countryBalanceHeaderRepo.deleteAll();
        countryBalanceRepo.deleteAll();
    }
}
