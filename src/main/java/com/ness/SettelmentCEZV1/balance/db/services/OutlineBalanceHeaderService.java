package com.ness.SettelmentCEZV1.balance.db.services;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;
import com.ness.SettelmentCEZV1.balance.db.repositories.OutlineBalanceHeaderRepo;
import com.ness.SettelmentCEZV1.balance.db.repositories.OutlineBalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutlineBalanceHeaderService {
    @Autowired
    private OutlineBalanceHeaderRepo outlineBalanceHeaderRepo;

    private OutlineBalanceRepo outlineBalanceRepo;

    public OutlineBalanceHeader save(OutlineBalanceHeader outlineBalanceHeader){
       // for (OutlineBalance outlineBalance : outlineBalanceHeader.getOutlineBalances())
        return outlineBalanceHeaderRepo.save(outlineBalanceHeader);
    }
}
