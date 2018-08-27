package com.xin.jpush.entity;

import java.sql.Date;

public class VehiclestateEntity {

    private int vehiclestateid;
    private int vehicleid;
    private double longtitude;
    private double latilude;
    private Date lastreporttime;
    private Date updated;

    public int getVehiclestateid() {
        return vehiclestateid;
    }

    public void setVehiclestateid(int vehiclestateid) {
        this.vehiclestateid = vehiclestateid;
    }

    public int getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(int vehicleid) {
        this.vehicleid = vehicleid;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public double getLatilude() {
        return latilude;
    }

    public void setLatilude(double latilude) {
        this.latilude = latilude;
    }

    public Date getLastreporttime() {
        return lastreporttime;
    }

    public void setLastreporttime(Date lastreporttime) {
        this.lastreporttime = lastreporttime;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
