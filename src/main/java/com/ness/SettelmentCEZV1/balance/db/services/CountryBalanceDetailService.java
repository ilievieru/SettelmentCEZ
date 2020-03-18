package com.ness.SettelmentCEZV1.balance.db.services;

import com.ness.SettelmentCEZV1.balance.db.entities.CountryBalanceDetail;
import com.ness.SettelmentCEZV1.balance.db.repositories.CountryBalanceDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryBalanceDetailService {

    @Autowired
    private CountryBalanceDetailRepo countryBalanceDetailRepo;

    public CountryBalanceDetail save(CountryBalanceDetail countryBalanceDetail){
       return countryBalanceDetailRepo.save(countryBalanceDetail);
    }
}
