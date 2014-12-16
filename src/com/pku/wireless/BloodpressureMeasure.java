package com.pku.wireless;

import java.util.Date;
import java.util.List;

import es.libresoft.mdnf.SFloatType;



public class BloodpressureMeasure {
	private int highPressure;
	private int lowPressure;
	private int average;
	private String unit;
	private Date date;
	private String type;
	
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	
	public void setHPressure(Object obj){
		this.highPressure = (int)(((SFloatType) ((List)obj).get(0)).doubleValueRepresentation());
	}
	public int getHPressure(){
		return this.highPressure;
	}
	
	public void setLPressure(Object obj){
		this.lowPressure = (int)(((SFloatType) ((List)obj).get(1)).doubleValueRepresentation());
	}
	public int getLPressure(){
		return this.lowPressure;
	}	
	
	public void setAPressure(Object obj){
		this.average = (int)(((SFloatType) ((List)obj).get(2)).doubleValueRepresentation());
	}
	public int getAPressure(){
		return this.average;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	public Date getDate(){
		return this.date;
	}
	
	public void setUint(String unit){
		this.unit = unit;
	}
	public String getUnit(){
		return this.unit;
	}

}
