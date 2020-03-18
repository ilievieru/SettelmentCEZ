package com.ness.SettelmentCEZV1.report.db.entities;

import javax.persistence.*;

@Entity
@Table(schema = "SettelmentCEZ")
public class ProducerReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String measuringPoint;
    private String direction;
    private String meterSeries;
    private long initialIndex;
    private long finalIndex;
    private long difference;
    private int K;
    private long energykWh;
    private long loss;
    private long total;

    public Long getId() {
        return id;
    }

    public String getMeasuringPoint() {
        return measuringPoint;
    }

    public String getDirection() {
        return direction;
    }

    public String getMeterSeries() {
        return meterSeries;
    }

    public long getInitialIndex() {
        return initialIndex;
    }

    public long getFinalIndex() {
        return finalIndex;
    }

    public long getDifference() {
        return difference;
    }

    public int getK() {
        return K;
    }

    public long getEnergykWh() {
        return energykWh;
    }

    public long getLoss() {
        return loss;
    }

    public long getTotal() {
        return total;
    }

    public void setMeasuringPoint(String measuringPoint) {
        this.measuringPoint = measuringPoint;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void setMeterSeries(String meterSeries) {
        this.meterSeries = meterSeries;
    }

    public void setInitialIndex(long initialIndex) {
        this.initialIndex = initialIndex;
    }

    public void setFinalIndex(long finalIndex) {
        this.finalIndex = finalIndex;
    }

    public void setDifference(long difference) {
        this.difference = difference;
    }

    public void setK(int k) {
        K = k;
    }

    public void setEnergykWh(long energykWh) {
        this.energykWh = energykWh;
    }

    public void setLoss(long loss) {
        this.loss = loss;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
