/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Sri Vyshnavi
 */
public class Uber {

    private int vinNumber;
    private String modelName;
    private boolean isAvailable;
    private String manufacturer;
    private LocalDate manufacturedDate;
    private int seatCapacity;
    private String usedBy;
    private String lastUpdated;
    private String city;
    private LocalDate maintenanceCertExpDate;

    private static int count = 0;

    public int getvinNumber() {
        return vinNumber;
    }

    public void setvinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return String.valueOf(modelName);
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean CarIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(LocalDate manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(String usedBy) {
        this.usedBy = usedBy;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getMaintenanceCertExpDate() {
        return maintenanceCertExpDate;
    }

    public void setMaintenanceCertExpDate(LocalDate maintenanceCertExpDate) {
        this.maintenanceCertExpDate = maintenanceCertExpDate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Uber.count = count;
    }

}
