package model;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srivyshnavi
 */
public class PersonalProfile {
    private String name;
    private String geographicData;
    private Date dob;
    private String phNum;
    private int faxNum;
    private String email;
    private int SSN;
    private int Medical;
    private int Health;
    private int BankAcc;
    private int CertNum;
    private int VehicleId;
    private int DeviceId;
    private String LinkedIn;
    private String IP;
    private String Biometric;
    private int UniqueID;
    private String imageDisplay;

    public String getImageDisplay() {
        return imageDisplay;
    }

    public void setImageDisplay(String imageDisplay) {
        this.imageDisplay = imageDisplay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(String geographicData) {
        this.geographicData = geographicData;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static void main(String args[])
    {
        System.out.println("Hello World");
        
    }
    public int getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(int faxNum) {
        this.faxNum = faxNum;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getMedical() {
        return Medical;
    }

    public void setMedical(int Medical) {
        this.Medical = Medical;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int Health) {
        this.Health = Health;
    }

    public int getBankAcc() {
        return BankAcc;
    }

    public void setBankAcc(int BankAcc) {
        this.BankAcc = BankAcc;
    }

    public int getCertNum() {
        return CertNum;
    }

    public void setCertNum(int CertNum) {
        this.CertNum = CertNum;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int VehicleId) {
        this.VehicleId = VehicleId;
    }

    public int getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(int DeviceId) {
        this.DeviceId = DeviceId;
    }

    public String getLinkedIn() {
        return LinkedIn;
    }

    public void setLinkedIn(String LinkedIn) {
        this.LinkedIn = LinkedIn;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getBiometric() {
        return Biometric;
    }

    public void setBiometric(String Biometric) {
        this.Biometric = Biometric;
    }

    public int getUniqueID() {
        return UniqueID;
    }

    public void setUniqueID(int UniqueID) {
        this.UniqueID = UniqueID;
    }
}
