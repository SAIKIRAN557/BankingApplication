package com.sai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Bank {
	
@Id

private int accNbr;

private String accName;

private String accPassword;

private double accAmount;

private String accAddress;

private long mobilenbr;

public Bank() {
	super();
}

public Bank(int accNbr, String accName, String accPassword, double accAmount, String accAddress, long mobilenbr) {
	super();
	this.accNbr = accNbr;
	this.accName = accName;
	this.accPassword = accPassword;
	this.accAmount = accAmount;
	this.accAddress = accAddress;
	this.mobilenbr = mobilenbr;
}

public int getAccNbr() {
	return accNbr;
}

public void setAccNbr(int accNbr) {
	this.accNbr = accNbr;
}

public String getAccName() {
	return accName;
}

public void setAccName(String accName) {
	this.accName = accName;
}

public String getAccPassword() {
	return accPassword;
}

public void setAccPassword(String accPassword) {
	this.accPassword = accPassword;
}

public double getAccAmount() {
	return accAmount;
}

public void setAccAmount(double accAmount) {
	this.accAmount = accAmount;
}

public String getAccAddress() {
	return accAddress;
}

public void setAccAddress(String accAddress) {
	this.accAddress = accAddress;
}

public long getMobilenbr() {
	return mobilenbr;
}

public void setMobilenbr(long mobilenbr) {
	this.mobilenbr = mobilenbr;
}

@Override
public String toString() {
	return "Bank [accNbr=" + accNbr + ", accName=" + accName + ", accPassword=" + accPassword + ", accAmount="
			+ accAmount + ", accAddress=" + accAddress + ", mobilenbr=" + mobilenbr + "]";
}



}
