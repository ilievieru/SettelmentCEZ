package com.ness.SettelmentCEZV1.balance.db.services;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;
import com.ness.SettelmentCEZV1.balance.db.repositories.OutlineBalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutlineBalanceService {
    @Autowired
    private OutlineBalanceRepo outlineBalanceRepo;

    public OutlineBalance save(OutlineBalance outlineBalance) {
        return outlineBalanceRepo.save(outlineBalance);
    }
}
