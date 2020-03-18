package com.ness.SettelmentCEZV1.balance.db.services;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;
import com.ness.SettelmentCEZV1.balance.db.repositories.OutlineBalanceHeaderRepo;
import com.ness.SettelmentCEZV1.balance.db.repositories.OutlineBalanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutlineBalanceHeaderService {
    @Autowired
    private OutlineBalanceHeaderRepo outlineBalanceHeaderRepo;

    private OutlineBalanceRepo outlineBalanceRepo;

    public OutlineBalanceHeader findByIndexLetter(String indexLetter){
        return outlineBalanceHeaderRepo.findByIndexLetter(indexLetter);
    }

    public OutlineBalanceHeader save(OutlineBalanceHeader outlineBalanceHeader) {
        return outlineBalanceHeaderRepo.save(outlineBalanceHeader);
    }

    public List<OutlineBalanceHeader> save(List<OutlineBalanceHeader> outlineBalanceHeaders) {
        for (OutlineBalanceHeader outlineBalanceHeader : outlineBalanceHeaders)
            outlineBalanceHeaderRepo.save(outlineBalanceHeader);
        return outlineBalanceHeaders;
    }

    public void deleteAll(){
        outlineBalanceHeaderRepo.deleteAll();
    }
}
