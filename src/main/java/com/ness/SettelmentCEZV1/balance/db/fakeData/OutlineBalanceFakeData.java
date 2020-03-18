package com.ness.SettelmentCEZV1.balance.db.fakeData;

import com.ness.SettelmentCEZV1.balance.db.calculation.OutlineBalanceCalculation;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;

import java.util.ArrayList;
import java.util.List;

public class OutlineBalanceFakeData {

    public List<OutlineBalance> fakeData1() {
        List<OutlineBalance> outlineBalances = new ArrayList<>();
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();

        OutlineBalance outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A1");
        outlineBalance.setName("Din centralele electrice racordate la reteaua de distributie a operatorului, la :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(819562.426);
        outlineBalance.setValueMT(101275.356);
        outlineBalance.setValueJT(121.901);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A2");
        outlineBalance.setName("Din transport la :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(70354.730);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A3");
        outlineBalance.setName("Din import la :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        return outlineBalances;
    }

    public List<OutlineBalance> fakeData2() {
        List<OutlineBalance> outlineBalances = new ArrayList<>();
        OutlineBalance outlineBalance = new OutlineBalance();
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();

        outlineBalance.setIndexLetter("A4.1");
        outlineBalance.setName("de la IT :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(376734.114);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A4.2");
        outlineBalance.setName("de la MT :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(38776.497);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(257433.889);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A4.3");
        outlineBalance.setName("de la JT :");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(4.755);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        return outlineBalances;
    }

    public List<OutlineBalance> fakeData3() {
        List<OutlineBalance> outlineBalances = new ArrayList<>();
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        OutlineBalance outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A5.1");
        outlineBalance.setName("de la Banat:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(26.532);
        outlineBalance.setValueMT(2339.616);
        outlineBalance.setValueJT(0);

        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A5.4");
        outlineBalance.setName("de la Muntenia Nord:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(1074.540);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A5.5");
        outlineBalance.setName("de la Muntenia Sud:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(18486.780);
        outlineBalance.setValueMT(1038.160);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("A5.8");
        outlineBalance.setName("de la Transilvania Sud:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        return outlineBalances;
    }

    public List<OutlineBalance> fakeData4() {
        List<OutlineBalance> outlineBalances = new ArrayList<>();
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        OutlineBalance outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B1");
        outlineBalance.setName("in Transport la:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(318819.620);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);

        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B2");
        outlineBalance.setName("La export de la:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B3");
        outlineBalance.setName("La producatori (soldata):");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(6814.731);
        outlineBalance.setValueMT(0.048);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        return outlineBalances;
    }

    public List<OutlineBalance> fakeData5() {
        List<OutlineBalance> outlineBalances = new ArrayList<>();
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        OutlineBalance outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B4.1");
        outlineBalance.setName("producatori de la:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(2028.565);
        outlineBalance.setValueMT(2460.601);
        outlineBalance.setValueJT(35.707);

        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B4.2");
        outlineBalance.setName("consumatori de la:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(165533.716);
        outlineBalance.setValueMT(162894.055);
        outlineBalance.setValueJT(241711.483);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B4.4");
        outlineBalance.setName("pentru regia OD");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(936.228);
        outlineBalance.setValueJT(132.739);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        return outlineBalances;
    }

    public List<OutlineBalance> fakeData6() {
        List<OutlineBalance> outlineBalances = new ArrayList<>();
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        OutlineBalance outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B5.1");
        outlineBalance.setName("la IT:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(38776.497);
        outlineBalance.setValueJT(0);

        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B5.2");
        outlineBalance.setName("la MT:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(376734.114);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(4.755);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B5.3");
        outlineBalance.setName("la JT:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(257433.889);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        return outlineBalances;
    }

    public List<OutlineBalance> fakeData7() {
        List<OutlineBalance> outlineBalances = new ArrayList<>();
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        OutlineBalance outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B6.1");
        outlineBalance.setName("la Banat:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(22523.394);
        outlineBalance.setValueMT(38.008);
        outlineBalance.setValueJT(0);

        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B6.4");
        outlineBalance.setName("la Muntenia Nord:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(64.107);
        outlineBalance.setValueMT(2295.886);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B6.5");
        outlineBalance.setName("la Muntenia Sud:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(36837.726);
        outlineBalance.setValueMT(140.447);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        outlineBalance = new OutlineBalance();
        outlineBalance.setIndexLetter("B6.8");
        outlineBalance.setName("la Transilvania Sud:");
        outlineBalance.setUnitOfMeasure("MWh");
        outlineBalance.setValueIT(0);
        outlineBalance.setValueMT(0);
        outlineBalance.setValueJT(0);
        outlineBalance.setTotalContourDistribution(outlineBalanceCalculation.calculateTotalLine(outlineBalance).getTotalContourDistribution());
        outlineBalances.add(outlineBalance);

        return outlineBalances;
    }
}
