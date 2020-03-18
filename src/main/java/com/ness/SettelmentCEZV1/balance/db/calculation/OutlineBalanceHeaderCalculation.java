package com.ness.SettelmentCEZV1.balance.db.calculation;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;
import com.ness.SettelmentCEZV1.balance.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class OutlineBalanceHeaderCalculation {

    double inputEnergyITFromOtherOD = 0;
    double inputEnergyMTFromOtherOD = 0;
    double inputEnergyJTFromOtherOD = 0;
    double inputEnergyTotalFromOtherOD = 0;

    double outputEnergyTotalIT = 0;
    double outputEnergyTotalMT = 0;
    double outputEnergyTotalJT = 0;
    double outputEnergyTotal = 0;

    public OutlineBalanceHeader initialCalculation(OutlineBalanceHeader outlineBalanceHeader) {

        if (outlineBalanceHeader.getOutlineBalances() != null) {
            for (OutlineBalance outlineBalance : outlineBalanceHeader.getOutlineBalances()) {
                outlineBalanceHeader.setTotalIT(outlineBalanceHeader.getTotalIT() + outlineBalance.getValueIT());
                outlineBalanceHeader.setTotalMT(outlineBalanceHeader.getTotalMT() + outlineBalance.getValueMT());
                outlineBalanceHeader.setTotalJT(outlineBalanceHeader.getTotalJT() + outlineBalance.getValueJT());
                outlineBalanceHeader.setTotalContourDistribution(outlineBalanceHeader.getTotalContourDistribution() + outlineBalance.getTotalContourDistribution());
            }
        }

        return outlineBalanceHeader;
    }

    public List<OutlineBalanceHeader> extraAndFinalCalculation(List<OutlineBalanceHeader> outlineBalanceHeaders) {
        extractInOutEnergy(outlineBalanceHeaders);
        recalculateInOutEnergy(outlineBalanceHeaders);

        OutlineBalanceHeader totalCpt = calculateCPT(outlineBalanceHeaders, getTechnicalCPT());
        OutlineBalanceHeader costEnergyForCPT = getCostEnergyForCPT();
        outlineBalanceHeaders.add(calculatePriceForCPT(totalCpt, costEnergyForCPT));
        outlineBalanceHeaders.add(costEnergyForCPT);

        OutlineBalanceHeader recoveredActiveEnergy = getRecoveredActiveEnergy();
        OutlineBalanceHeader recalculatedCPT = recalculateCPT(recoveredActiveEnergy);
        outlineBalanceHeaders.add(recoveredActiveEnergy);
        outlineBalanceHeaders.add(recalculatedCPT);

        outlineBalanceHeaders.add(recalculateCPTPercentage(recalculatedCPT));
        return outlineBalanceHeaders;
    }

    //Second loop. Collect data for in/out energy from list
    private void extractInOutEnergy(List<OutlineBalanceHeader> outlineBalanceHeaders) {
        for (OutlineBalanceHeader outlineBalanceHeader : outlineBalanceHeaders) {
            if (outlineBalanceHeader.getIndexLetter().equals("A4") ||
                    outlineBalanceHeader.getIndexLetter().equals("A5")) {
                inputEnergyITFromOtherOD = inputEnergyITFromOtherOD + outlineBalanceHeader.getTotalIT();
                inputEnergyMTFromOtherOD = inputEnergyMTFromOtherOD + outlineBalanceHeader.getTotalMT();
                inputEnergyJTFromOtherOD = inputEnergyJTFromOtherOD + outlineBalanceHeader.getTotalJT();
                if (!outlineBalanceHeader.getIndexLetter().equals("A4"))
                    inputEnergyTotalFromOtherOD = inputEnergyTotalFromOtherOD + outlineBalanceHeader.getTotalContourDistribution();
            }

            if (outlineBalanceHeader.getIndexLetter().equals("B4") ||
                    outlineBalanceHeader.getIndexLetter().equals("B5") ||
                    outlineBalanceHeader.getIndexLetter().equals("B6") ||
                    outlineBalanceHeader.getIndexLetter().equals("M")) {

                outputEnergyTotalIT = outputEnergyTotalIT + outlineBalanceHeader.getTotalIT();
                outputEnergyTotalMT = outputEnergyTotalMT + outlineBalanceHeader.getTotalMT();
                outputEnergyTotalJT = outputEnergyTotalJT + outlineBalanceHeader.getTotalJT();
                if (!outlineBalanceHeader.getIndexLetter().equals("B5"))
                    outputEnergyTotal = outputEnergyTotal + outlineBalanceHeader.getTotalContourDistribution();
            }
        }
    }

    //Third loop. Use data collected to recalculate in/out energy
    private void recalculateInOutEnergy(List<OutlineBalanceHeader> outlineBalanceHeaders) {
        for (OutlineBalanceHeader outlineBalanceHeader : outlineBalanceHeaders) {

            if (outlineBalanceHeader.getIndexLetter().equals("A")) {
                outlineBalanceHeader.setTotalIT(outlineBalanceHeader.getTotalIT() + inputEnergyITFromOtherOD);
                outlineBalanceHeader.setTotalMT(outlineBalanceHeader.getTotalMT() + inputEnergyMTFromOtherOD);
                outlineBalanceHeader.setTotalJT(outlineBalanceHeader.getTotalJT() + inputEnergyJTFromOtherOD);
                outlineBalanceHeader.setTotalContourDistribution(outlineBalanceHeader.getTotalContourDistribution() + inputEnergyTotalFromOtherOD);
                inputEnergyITFromOtherOD = outlineBalanceHeader.getTotalIT();
                inputEnergyMTFromOtherOD = outlineBalanceHeader.getTotalMT();
                inputEnergyJTFromOtherOD = outlineBalanceHeader.getTotalJT();
                inputEnergyTotalFromOtherOD = outlineBalanceHeader.getTotalContourDistribution();
            }

            if (outlineBalanceHeader.getIndexLetter().equals("B")) {
                outlineBalanceHeader.setTotalIT(outlineBalanceHeader.getTotalIT() + outputEnergyTotalIT);
                outlineBalanceHeader.setTotalMT(outlineBalanceHeader.getTotalMT() + outputEnergyTotalMT);
                outlineBalanceHeader.setTotalJT(outlineBalanceHeader.getTotalJT() + outputEnergyTotalJT);
                outlineBalanceHeader.setTotalContourDistribution(outlineBalanceHeader.getTotalContourDistribution() + outputEnergyTotal);
                outputEnergyTotalIT = outlineBalanceHeader.getTotalIT();
                outputEnergyTotalMT = outlineBalanceHeader.getTotalMT();
                outputEnergyTotalJT = outlineBalanceHeader.getTotalJT();
                outputEnergyTotal = outlineBalanceHeader.getTotalContourDistribution();
            }

        }
    }

    private OutlineBalanceHeader calculatePriceForCPT(OutlineBalanceHeader cptTotal, OutlineBalanceHeader costEnergyForCPT) {
        OutlineBalanceHeader costCpt = new OutlineBalanceHeader();
        costCpt.setDistributionOperator(cptTotal.getDistributionOperator());
        costCpt.setYear(cptTotal.getYear());
        costCpt.setMonth(cptTotal.getMonth());
        costCpt.setName("Pret mediu de achizitie a energiei electrice pentru CPT, inclusiv servicii aferente");
        costCpt.setUnitOfMeasure("lei/MWh");
        costCpt.setIndexLetter("E");
        if (cptTotal.getTotalIT() != 0)
            costCpt.setTotalIT(costEnergyForCPT.getTotalIT() / cptTotal.getTotalIT());
        if (cptTotal.getTotalMT() != 0)
            costCpt.setTotalMT(costEnergyForCPT.getTotalMT() / cptTotal.getTotalMT());
        if (cptTotal.getTotalJT() != 0)
            costCpt.setTotalJT(costEnergyForCPT.getTotalJT() / cptTotal.getTotalJT());
        if (cptTotal.getTotalContourDistribution() != 0)
            costCpt.setTotalContourDistribution(costEnergyForCPT.getTotalContourDistribution() / cptTotal.getTotalContourDistribution());

        return costCpt;
    }

    private OutlineBalanceHeader calculateCPT(List<OutlineBalanceHeader> outlineBalanceHeaders, OutlineBalance technicalCPT) {
        OutlineBalanceHeader cptTotal = new OutlineBalanceHeader();
        cptTotal.setDistributionOperator(outlineBalanceHeaders.get(1).getDistributionOperator());
        cptTotal.setYear(outlineBalanceHeaders.get(1).getYear());
        cptTotal.setMonth(outlineBalanceHeaders.get(1).getMonth());
        cptTotal.setName("CPT tolal (A-B)");
        cptTotal.setUnitOfMeasure(Constants.UnitOfMeasure.MWh.getUnitOfMeasure());
        cptTotal.setIndexLetter("C");
        cptTotal.setTotalIT(inputEnergyITFromOtherOD - outputEnergyTotalIT);
        cptTotal.setTotalMT(inputEnergyMTFromOtherOD - outputEnergyTotalMT);
        cptTotal.setTotalJT(inputEnergyJTFromOtherOD - outputEnergyTotalJT);
        cptTotal.setTotalContourDistribution(cptTotal.getTotalIT() + cptTotal.getTotalMT() + cptTotal.getTotalJT());

        List<OutlineBalance> technicalAndCommercialCPT = new ArrayList<>();
        technicalAndCommercialCPT.add(technicalCPT);

        OutlineBalance commercialCPT = new OutlineBalance();
        commercialCPT.setIndexLetter("C2");
        commercialCPT.setName("CPT comercial");
        commercialCPT.setUnitOfMeasure(technicalCPT.getUnitOfMeasure());
        commercialCPT.setValueIT(cptTotal.getTotalIT() - technicalCPT.getValueIT());
        commercialCPT.setValueMT(cptTotal.getTotalMT() - technicalCPT.getValueMT());
        commercialCPT.setValueJT(cptTotal.getTotalJT() - technicalCPT.getValueJT());
        commercialCPT.setTotalContourDistribution(commercialCPT.getValueIT() + commercialCPT.getValueMT() + commercialCPT.getValueJT());
        technicalAndCommercialCPT.add(commercialCPT);

        cptTotal.setOutlineBalances(technicalAndCommercialCPT);
        outlineBalanceHeaders.add(cptTotal);

        outlineBalanceHeaders.add(calculateCPTPercentage(cptTotal, technicalCPT, commercialCPT));

        return cptTotal;
    }

    private OutlineBalanceHeader calculateCPTPercentage(OutlineBalanceHeader cptTotal, OutlineBalance technicalCPT, OutlineBalance commercialCPT) {
        List<OutlineBalance> technicalAndCommercialCPTPercentage = new ArrayList<>();
        OutlineBalanceHeader cptTotalPercentage = new OutlineBalanceHeader();
        cptTotalPercentage.setDistributionOperator(cptTotal.getDistributionOperator());
        cptTotalPercentage.setYear(cptTotal.getYear());
        cptTotalPercentage.setMonth(cptTotal.getMonth());
        cptTotalPercentage.setName("CPT total (100*C/A)");
        cptTotalPercentage.setUnitOfMeasure("%");
        cptTotalPercentage.setIndexLetter("D");

        OutlineBalance technicalCPTPercentage = new OutlineBalance();
        technicalCPTPercentage.setIndexLetter("D1");
        technicalCPTPercentage.setName("CPT tehnic (100*C1/A)");
        technicalCPTPercentage.setUnitOfMeasure("%");

        OutlineBalance commercialCPTCA = new OutlineBalance();
        commercialCPTCA.setIndexLetter("D2");
        commercialCPTCA.setName("CPT comercial (100*C1/A)");
        commercialCPTCA.setUnitOfMeasure("%");

        if (inputEnergyITFromOtherOD != 0) {
            cptTotalPercentage.setTotalIT((cptTotal.getTotalIT() / inputEnergyITFromOtherOD) * 100);
            technicalCPTPercentage.setValueIT((technicalCPT.getValueIT() / inputEnergyITFromOtherOD) * 100);
            commercialCPTCA.setValueIT((commercialCPT.getValueIT() / inputEnergyITFromOtherOD) * 100);
        }
        if (inputEnergyMTFromOtherOD != 0) {
            cptTotalPercentage.setTotalMT((cptTotal.getTotalMT() / inputEnergyMTFromOtherOD) * 100);
            technicalCPTPercentage.setValueMT((technicalCPT.getValueMT() / inputEnergyMTFromOtherOD) * 100);
            commercialCPTCA.setValueMT((commercialCPT.getValueMT() / inputEnergyMTFromOtherOD) * 100);
        }
        if (inputEnergyJTFromOtherOD != 0) {
            cptTotalPercentage.setTotalJT((cptTotal.getTotalJT() / inputEnergyJTFromOtherOD) * 100);
            technicalCPTPercentage.setValueJT((technicalCPT.getValueJT() / inputEnergyJTFromOtherOD) * 100);
            commercialCPTCA.setValueJT((commercialCPT.getValueJT() / inputEnergyJTFromOtherOD) * 100);
        }
        if (inputEnergyTotalFromOtherOD != 0) {
            cptTotalPercentage.setTotalContourDistribution((cptTotal.getTotalContourDistribution() / inputEnergyTotalFromOtherOD) * 100);
            technicalCPTPercentage.setTotalContourDistribution((technicalCPT.getTotalContourDistribution() / inputEnergyTotalFromOtherOD) * 100);
            commercialCPTCA.setTotalContourDistribution((commercialCPT.getTotalContourDistribution() / inputEnergyTotalFromOtherOD) * 100);
        }
        technicalAndCommercialCPTPercentage.add(technicalCPTPercentage);
        technicalAndCommercialCPTPercentage.add(commercialCPTCA);

        cptTotalPercentage.setOutlineBalances(technicalAndCommercialCPTPercentage);

        return cptTotalPercentage;
    }

    private OutlineBalanceHeader recalculateCPT(OutlineBalanceHeader recoveredActiveEnergy) {

        OutlineBalanceHeader cptRecalculated = new OutlineBalanceHeader();
        cptRecalculated.setDistributionOperator(recoveredActiveEnergy.getDistributionOperator());
        cptRecalculated.setYear(recoveredActiveEnergy.getYear());
        cptRecalculated.setMonth(recoveredActiveEnergy.getMonth());
        cptRecalculated.setName("CPT Recalculat");
        cptRecalculated.setUnitOfMeasure("MWh");
        cptRecalculated.setIndexLetter("Q");
        cptRecalculated.setTotalIT(inputEnergyITFromOtherOD - outputEnergyTotalIT - recoveredActiveEnergy.getTotalIT());
        cptRecalculated.setTotalMT(inputEnergyMTFromOtherOD - outputEnergyTotalMT - recoveredActiveEnergy.getTotalMT());
        cptRecalculated.setTotalJT(inputEnergyJTFromOtherOD - outputEnergyTotalJT - recoveredActiveEnergy.getTotalJT());
        cptRecalculated.setTotalContourDistribution(inputEnergyTotalFromOtherOD - outputEnergyTotal - recoveredActiveEnergy.getTotalContourDistribution());

        return cptRecalculated;
    }

    private OutlineBalanceHeader recalculateCPTPercentage(OutlineBalanceHeader cptRecalculated) {
        OutlineBalanceHeader cptRecalculatedPercentage = new OutlineBalanceHeader();
        cptRecalculatedPercentage.setDistributionOperator(cptRecalculated.getDistributionOperator());
        cptRecalculatedPercentage.setYear(cptRecalculated.getYear());
        cptRecalculatedPercentage.setMonth(cptRecalculated.getMonth());
        cptRecalculatedPercentage.setName("CPT Recalculat");
        cptRecalculatedPercentage.setUnitOfMeasure("%");
        cptRecalculatedPercentage.setIndexLetter("R");
        if (inputEnergyITFromOtherOD != 0)
            cptRecalculatedPercentage.setTotalIT((cptRecalculated.getTotalIT() / inputEnergyITFromOtherOD) * 100);
        if (inputEnergyMTFromOtherOD != 0)
            cptRecalculatedPercentage.setTotalMT((cptRecalculated.getTotalMT() / inputEnergyMTFromOtherOD) * 100);
        if (inputEnergyJTFromOtherOD != 0)
            cptRecalculatedPercentage.setTotalJT((cptRecalculated.getTotalJT() / inputEnergyJTFromOtherOD) * 100);
        if (inputEnergyTotalFromOtherOD != 0)
            cptRecalculatedPercentage.setTotalContourDistribution((cptRecalculated.getTotalContourDistribution() / inputEnergyTotalFromOtherOD) * 100);

        return cptRecalculatedPercentage;

    }

    //TODO: Implement method to extract technical CPT from DB (C1 column excel)
    private OutlineBalance getTechnicalCPT() {
        OutlineBalanceCalculation outlineBalanceCalculation = new OutlineBalanceCalculation();
        OutlineBalance technicalCPT = new OutlineBalance();
        technicalCPT.setIndexLetter("C1");
        technicalCPT.setUnitOfMeasure(Constants.UnitOfMeasure.MWh.getUnitOfMeasure());
        technicalCPT.setName("CPT tehnic");
        technicalCPT.setValueIT(17842.867);
        technicalCPT.setValueMT(17439.900);
        technicalCPT.setValueJT(14222.500);
        return outlineBalanceCalculation.calculateTotalLine(technicalCPT);
    }

    //TODO: Implement method to extract energy cost for CPT (F column excel)
    private OutlineBalanceHeader getCostEnergyForCPT() {

        OutlineBalanceHeader outlineBalanceHeader = new OutlineBalanceHeader();
        outlineBalanceHeader.setDistributionOperator("SC CEZ Distributie SA");
        outlineBalanceHeader.setYear(2019);
        outlineBalanceHeader.setMonth(5);
        outlineBalanceHeader.setIndexLetter("F");
        outlineBalanceHeader.setName("Costuri cu energia electrica pentru CPT, inclusiv serviciile aferente ");
        outlineBalanceHeader.setUnitOfMeasure("lei");

        return outlineBalanceHeader;
    }

    //TODO: Implement method to extract recovered active energy for recalculation of CPT (O column excel)
    private OutlineBalanceHeader getRecoveredActiveEnergy() {
        OutlineBalanceHeader recoveredActiveEnergy = new OutlineBalanceHeader();
        recoveredActiveEnergy.setDistributionOperator("SC CEZ Distributie SA");
        recoveredActiveEnergy.setYear(2019);
        recoveredActiveEnergy.setMonth(5);
        recoveredActiveEnergy.setIndexLetter("O");
        recoveredActiveEnergy.setName("Energie activa recuperata din recalculari (pentru lunile anterioare) ");
        recoveredActiveEnergy.setUnitOfMeasure("lei");
        recoveredActiveEnergy.setTotalIT(0);
        recoveredActiveEnergy.setTotalMT(0);
        recoveredActiveEnergy.setTotalJT(1453.342);
        recoveredActiveEnergy.setTotalContourDistribution(recoveredActiveEnergy.getTotalIT() + recoveredActiveEnergy.getTotalMT() + recoveredActiveEnergy.getTotalJT());
        return recoveredActiveEnergy;
    }
}
