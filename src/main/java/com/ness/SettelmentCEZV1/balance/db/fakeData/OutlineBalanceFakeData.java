package com.ness.SettelmentCEZV1.balance.db.fakeData;

import com.ness.SettelmentCEZV1.balance.db.calculation.OutlineBalanceCalculation;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;

public class OutlineBalanceFakeData {

    public OutlineBalance fakeData1(){
        OutlineBalance outlineBalance =  new OutlineBalance();
        outlineBalance.setIndexLetter("A1");
        outlineBalance.setName("Din centralele electrice racordate la reteaua de distributie a operatorului, la :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(819562.426);
        outlineBalance.setValueMT(101275.356);
        outlineBalance.setValueJT(121.901);

        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());

        return outlineBalance;
    }
    public OutlineBalance fakeData2(){
        OutlineBalance outlineBalance =  new OutlineBalance();
        outlineBalance.setIndexLetter("A2");
        outlineBalance.setName("Din transport la :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(70354.730);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);

        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());

        return outlineBalance;
    }
    public OutlineBalance fakeData3(){
        OutlineBalance outlineBalance =  new OutlineBalance();
        outlineBalance.setIndexLetter("A3");
        outlineBalance.setName("Din import la :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);

        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());

        return outlineBalance;
    }

    public OutlineBalance fakeData4(){
        OutlineBalance outlineBalance =  new OutlineBalance();
        outlineBalance.setIndexLetter("A4.1");
        outlineBalance.setName("de la IT :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(376734.114);
        outlineBalance.setValueJT(0);

        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());

        return outlineBalance;
    }
    public OutlineBalance fakeData5(){
        OutlineBalance outlineBalance =  new OutlineBalance();
        outlineBalance.setIndexLetter("A4.2");
        outlineBalance.setName("de la MT :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(38776.497);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(257433.889);

        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());

        return outlineBalance;
    }
    public OutlineBalance fakeData6(){
        OutlineBalance outlineBalance =  new OutlineBalance();
        outlineBalance.setIndexLetter("A4.3");
        outlineBalance.setName("de la JT :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(4.755);
        outlineBalance.setValueJT(0);

        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());

        return outlineBalance;
    }
}
