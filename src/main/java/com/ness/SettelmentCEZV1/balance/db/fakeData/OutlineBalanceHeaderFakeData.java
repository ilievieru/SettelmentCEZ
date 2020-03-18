package com.ness.SettelmentCEZV1.balance.db.fakeData;

import com.ness.SettelmentCEZV1.balance.db.calculation.OutlineBalanceHeaderCalculation;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;

import java.util.ArrayList;
import java.util.List;

public class OutlineBalanceHeaderFakeData {

    public List<OutlineBalanceHeader> fakeData(){
        List<OutlineBalanceHeader> outlineBalanceHeaders = new ArrayList<>();

        OutlineBalanceHeaderCalculation outlineBalanceHeaderCalculation = new OutlineBalanceHeaderCalculation();
        OutlineBalanceFakeData outlineBalanceFakeData =  new OutlineBalanceFakeData();
        OutlineBalanceHeader outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("A");
        outlineBalanceHeader.setName("Energie electrica intrata ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");
        outlineBalanceHeader.setOutlineBalances(outlineBalanceFakeData.fakeData1());
        outlineBalanceHeaderCalculation.initialCalculation(outlineBalanceHeader);
        outlineBalanceHeaders.add(outlineBalanceHeader);

        outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("A4");
        outlineBalanceHeader.setName("Din alte nuveluri de tensiune, in interiorul reteli OD, la: ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");
        outlineBalanceHeader.setOutlineBalances(outlineBalanceFakeData.fakeData2());
        outlineBalanceHeaderCalculation.initialCalculation(outlineBalanceHeader);
        outlineBalanceHeaders.add(outlineBalanceHeader);

        outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("A5");
        outlineBalanceHeader.setName("De la alti OD, la: ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");
        outlineBalanceHeader.setOutlineBalances(outlineBalanceFakeData.fakeData3());
        outlineBalanceHeaderCalculation.initialCalculation(outlineBalanceHeader);
        outlineBalanceHeaders.add(outlineBalanceHeader);

        outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("B");
        outlineBalanceHeader.setName("Energie electrica iesita/consumata ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");
        outlineBalanceHeader.setOutlineBalances(outlineBalanceFakeData.fakeData4());
        outlineBalanceHeaderCalculation.initialCalculation(outlineBalanceHeader);
        outlineBalanceHeaders.add(outlineBalanceHeader);

        outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("B4");
        outlineBalanceHeader.setName("Edergie distribuita, din care:");
        outlineBalanceHeader.setUnitOfMeasure("MWh");
        outlineBalanceHeader.setOutlineBalances(outlineBalanceFakeData.fakeData5());
        outlineBalanceHeaderCalculation.initialCalculation(outlineBalanceHeader);
        outlineBalanceHeaders.add(outlineBalanceHeader);

        outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("B5");
        outlineBalanceHeader.setName("Cedat in alte niveluri de tensiune, in interiorul retelei OD, de la: ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");
        outlineBalanceHeader.setOutlineBalances(outlineBalanceFakeData.fakeData6());
        outlineBalanceHeaderCalculation.initialCalculation(outlineBalanceHeader);
        outlineBalanceHeaders.add(outlineBalanceHeader);

        outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("B6");
        outlineBalanceHeader.setName("Cedat la alti OD, de la: ");
        outlineBalanceHeader.setUnitOfMeasure("MWh");
        outlineBalanceHeader.setOutlineBalances(outlineBalanceFakeData.fakeData7());
        outlineBalanceHeaderCalculation.initialCalculation(outlineBalanceHeader);
        outlineBalanceHeaders.add(outlineBalanceHeader);

        return outlineBalanceHeaderCalculation.extraAndFinalCalculation(outlineBalanceHeaders);
    }
}
