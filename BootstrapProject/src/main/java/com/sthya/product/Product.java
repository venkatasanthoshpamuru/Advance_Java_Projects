package com.sthya.product;

import java.sql.Date;

public class Product {
 private String proId;
 private String proName;
 private Double proPrice;
 private String proBrand;
 private String proMade;
 private Date proMfgDate;
 private Date proExpDate;
public String getProId() {
	return proId;
}
public void setProId(String proId) {
	this.proId = proId;
}
public String getProName() {
	return proName;
}
public void setProName(String proName) {
	this.proName = proName;
}
public Double getProPrice() {
	return proPrice;
}
public void setProPrice(Double proPrice) {
	this.proPrice = proPrice;
}
public String getProBrand() {
	return proBrand;
}
public void setProBrand(String proBrand) {
	this.proBrand = proBrand;
}
public String getProMade() {
	return proMade;
}
public void setProMade(String proMade) {
	this.proMade = proMade;
}
public Date getProMfgDate() {
	return proMfgDate;
}
public void setProMfgDate(Date proMfgDate2) {
	this.proMfgDate = proMfgDate2;
}
public Date getProExpDate() {
	return proExpDate;
}
public void setProExpDate(Date proExpDate) {
	this.proExpDate = proExpDate;
}
}
