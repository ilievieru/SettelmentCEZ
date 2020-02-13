package com.ness.SettelmentCEZV1.balance.db.calculation;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;
import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalanceHeader;

public class OutlineBalanceHeaderCalculation {

    //TODO: This need to be change to get data from db instead of fakeData
    public OutlineBalanceHeader populate() {
        OutlineBalanceHeader outlineBalanceHeader = new OutlineBalanceHeader();
        //TODO: get data from db.

        return outlineBalanceHeader;
    }

    //Todo: Complete the method for "TOTAL Contur Distributie" and other specific cases
    public OutlineBalanceHeader calculate(OutlineBalanceHeader outlineBalanceHeader) {

        for (OutlineBalance outlineBalance : outlineBalanceHeader.getOutlineBalances()) {

            outlineBalanceHeader.setTotalIT(outlineBalanceHeader.getTotalIT() + outlineBalance.getValueIT());
            outlineBalanceHeader.setTotalMT(outlineBalanceHeader.getTotalMT() + outlineBalance.getValueMT());
            outlineBalanceHeader.setTotalJT(outlineBalanceHeader.getTotalJT() + outlineBalance.getValueJT());
            //outlineBalanceHeader.setTotalContourDistribution(outlineBalanceHeader.getTotalContourDistribution() + outlineBalance.getTotalContourDistribution());

        }

        return outlineBalanceHeader;
    }
}
