package com.ness.SettelmentCEZV1.balance.db.calculation;

import com.ness.SettelmentCEZV1.balance.db.entities.OutlineBalance;

public class OutlineBalanceCalculation {

    //TODO: This need to be change to get data from db instead of fakeData
    private OutlineBalance populate() {
        OutlineBalance outlineBalance = new OutlineBalance();
        //TODO: get data from db.
        return outlineBalance;
    }

    public OutlineBalance calculateTotalLine(OutlineBalance outlineBalance) {
        outlineBalance.setTotalContourDistribution(outlineBalance.getValueIT() + outlineBalance.getValueJT() + outlineBalance.getValueMT());
        return outlineBalance;
    }
}
