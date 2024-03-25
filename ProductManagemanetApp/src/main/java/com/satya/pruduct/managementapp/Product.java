package com.satya.pruduct.managementapp;

import java.io.InputStream;
import java.sql.Date;

public class Product {
	private String proId;
	private String proName;
	private double proPrice;
	private String proBrand;
	private String proMadeIn;
	private Date manfactureDate;
	private Date expireDate;
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
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getManfactureDate() {
		return manfactureDate;
	}
	public void setManfactureDate(Date manfactureDate) {
		this.manfactureDate = manfactureDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}
	private byte[] proImage;
	
		}
