package com.ness.SettelmentCEZV1.balance.util;

public interface Constants {

    enum UnitOfMeasure {
        MWh ("MWh"), percent("%"), lei("lei"), leiOnMWh("lei/MWh");

        private String unitOfMeasure;
        UnitOfMeasure(String unitOfMeasure){
            this.unitOfMeasure = unitOfMeasure;
        }

        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }


    }
}
