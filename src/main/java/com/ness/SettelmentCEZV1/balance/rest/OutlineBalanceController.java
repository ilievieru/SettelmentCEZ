package com.ness.SettelmentCEZV1.balance.rest;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;
import com.ness.SettelmentCEZV1.balance.db.fakeData.OutlineBalanceHeaderFakeData;
import com.ness.SettelmentCEZV1.balance.db.services.OutlineBalanceHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OutlineBalanceController {
    OutlineBalanceHeaderFakeData outlineBalanceHeaderFakeData = new OutlineBalanceHeaderFakeData();
    @Autowired
    private OutlineBalanceHeaderService outlineBalanceHeaderService;

    @GetMapping("/outlineBalanceGenerate")
    public List<OutlineBalanceHeader> generate() {

        outlineBalanceHeaderService.deleteAll();
        List<OutlineBalanceHeader> outlineBalanceHeader = outlineBalanceHeaderFakeData.fakeData();
        outlineBalanceHeaderService.save(outlineBalanceHeader);

        return outlineBalanceHeader;
    }
}
