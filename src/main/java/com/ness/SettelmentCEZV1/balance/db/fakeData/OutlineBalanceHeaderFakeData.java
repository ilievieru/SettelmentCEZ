package com.ness.SettelmentCEZV1.balance.db.fakeData;

import com.ness.SettelmentCEZV1.balance.db.calculation.OutlineBalanceHeaderCalculation;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;

import java.util.ArrayList;
import java.util.List;

public class OutlineBalanceHeaderFakeData {

    public OutlineBalanceHeader fakeData1(){
        OutlineBalanceFakeData outlineBalanceFakeData =  new OutlineBalanceFakeData();

        OutlineBalanceHeader outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("A");
        outlineBalanceHeader.setName("Energie electrica intrata ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");

       List<OutlineBalance> outlineBalances = new ArrayList<>();
        outlineBalances.add(outlineBalanceFakeData.fakeData1());
        outlineBalances.add(outlineBalanceFakeData.fakeData2());
        outlineBalances.add(outlineBalanceFakeData.fakeData3());
        outlineBalanceHeader.setOutlineBalances(outlineBalances);

        OutlineBalanceHeaderCalculation outlineBalanceHeaderCalculation = new OutlineBalanceHeaderCalculation();
        outlineBalanceHeaderCalculation.calculate(outlineBalanceHeader);

        return outlineBalanceHeader;
    }

    public OutlineBalanceHeader fakeData2(){
        OutlineBalanceFakeData outlineBalanceFakeData =  new OutlineBalanceFakeData();

        OutlineBalanceHeader outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("A4");
        outlineBalanceHeader.setName("Din alte nuveluri de tensiune, in interiorul reteli OD, la: ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");

        List<OutlineBalance> outlineBalances = new ArrayList<>();
        outlineBalances.add(outlineBalanceFakeData.fakeData4());
        outlineBalances.add(outlineBalanceFakeData.fakeData5());
        outlineBalances.add(outlineBalanceFakeData.fakeData6());
        outlineBalanceHeader.setOutlineBalances(outlineBalances);

        OutlineBalanceHeaderCalculation outlineBalanceHeaderCalculation = new OutlineBalanceHeaderCalculation();
        outlineBalanceHeaderCalculation.calculate(outlineBalanceHeader);

        return outlineBalanceHeader;
    }
}
