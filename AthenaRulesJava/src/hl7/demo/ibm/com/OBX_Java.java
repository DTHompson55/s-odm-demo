package hl7.demo.ibm.com;

import java.lang.Double;
import java.util.Date;

public class OBX_Java {

	    protected String obxSequenceNumber;      
		protected String control;      
		protected String accessionNumber;  
	    protected String observationID;
	    protected String observationName;  
	    protected String observationValue; 
	    protected double observationDoubleValue;  
	    protected String observationUnits;  
	    protected String observationRange;  
	    protected String abnormalFlags;  
	    protected String natureOfAbnoralFlags;  
	    protected String observationResultStatus; 
		protected boolean isPending;
		protected String observationDate;
		protected Date   date;

	    
		public static OBX_Java create(){
			return new OBX_Java();
		}

	    public boolean isPending() {
			return isPending;
		}

		public void setPending(String isPending) {
			this.isPending = isPending.startsWith("PENDING");
		}

		public void setPending(boolean isPending) {
			this.isPending = isPending;
		}

	    public String getOBXSequenceNumber() {
	        return obxSequenceNumber;
	    }

	    public void setOBXSequenceNumber(String value) {
	        this.obxSequenceNumber = value;
	    }

	    public String getControl() {
	        return control;
	    }

	    public void setControl(String value) {
	        this.control = value;
	    }

	    public String getAccessionNumber() {
	        return accessionNumber;
	    }

	    public void setAccessionNumber(String value) {
	        this.accessionNumber = value;
	    }

	    public String getobservationID() {
	        return observationID;
	    }

	    public void setobservationID(String value) {
	        this.observationID = value;
	    }

	    public String getobservationName() {
	        return observationName;
	    }

	    public void setobservationName(String value) {
	    	this.observationName = value;
	    }

	    public String getobservationValue() {
	        return observationValue;
	    }

	    public void setobservationValue(String value) {
	    	try {this.observationDoubleValue = Double.parseDouble(value);}
	    	 catch(Exception e){
	    		 this.observationDoubleValue = Double.NaN;}
	        this.observationValue = value; 
	    }

	    public String getobservationUnits() {
	        return observationUnits;
	    }

	    public void setobservationUnits(String value) {
	        this.observationUnits = value;
	    }

	    public String getobservationRange() {
	        return observationRange;
	    }

	    public void setobservationRange(String value) {
	        this.observationRange = value;
	    }

	    public String getAbnormalFlags() {
	        return abnormalFlags;
	    }

	    public void setAbnormalFlags(String value) {
	        this.abnormalFlags = value;
	    }

	    public String getNatureOfAbnoralFlags() {
	        return natureOfAbnoralFlags;
	    }

	    public void setNatureOfAbnoralFlags(String value) {
	        this.natureOfAbnoralFlags = value;
	    }

	    public String getobservationResultStatus() {
	        return observationResultStatus;
	    }

	    public void setobservationResultStatus(String value) {
	        this.observationResultStatus = value;
	    }
	
		
	public boolean isHigh(){
		int i;
		String s = this.observationRange;
		try {
			double value = this.observationDoubleValue;
			//if ((i=s.indexOf("> OR = "))>0 )  return (value >= (Double.parseDouble(s.substring(i+7))));
			if ((i=s.indexOf("< OR = "))>0 )  return !(value <= (Double.parseDouble(s.substring(i+7))));
			//if ((i=s.indexOf("> ")) >0)       return (value >  (Double.parseDouble(s.substring(i+2))));
			if ((i=s.indexOf("< ")) >0)       return !(value <  (Double.parseDouble(s.substring(i+2))));
			if ((i=s.indexOf("-")) >0){
			//	double a = Double.parseDouble(s.substring(0,i));
				double b = Double.parseDouble(s.substring(i+1));
				return ((value > b));
			}		 
		} catch (Exception e){
			return false;
		}
		return false;
	}

	public boolean isLow(){
		int i;
		String s = this.observationRange;
		try {
			double value = this.observationDoubleValue;
			if ((i=s.indexOf("> OR = "))>0 )  return !(value >= (Double.parseDouble(s.substring(i+7))));
			//if ((i=s.indexOf("< OR = "))>0 )  return (value <= (Double.parseDouble(s.substring(i+7))));
			if ((i=s.indexOf("> ")) >0)       return !(value >  (Double.parseDouble(s.substring(i+2))));
			//if ((i=s.indexOf("< ")) >0)       return (value <  (Double.parseDouble(s.substring(i+2))));
			if ((i=s.indexOf("-")) >0){
				double a = Double.parseDouble(s.substring(0,i));
				//double b = Double.parseDouble(s.substring(i+1));
				return (( value < a ));
			}		 
		} catch (Exception e){
			return false;
		}
		return false;
	}
	
	public boolean isNormal(){
		int i;
		String s = this.observationRange;
		try {
			double value = this.observationDoubleValue;
			if ((i=s.indexOf("> OR = "))>0 )  return (value >= (Double.parseDouble(s.substring(i+7))));
			if ((i=s.indexOf("< OR = "))>0 )  return (value <= (Double.parseDouble(s.substring(i+7))));
			if ((i=s.indexOf("> ")) >0)       return (value >  (Double.parseDouble(s.substring(i+2))));
			if ((i=s.indexOf("< ")) >0)       return (value <  (Double.parseDouble(s.substring(i+2))));
			if ((i=s.indexOf("-")) >0){
				double a = Double.parseDouble(s.substring(0,i));
				double b = Double.parseDouble(s.substring(i+1));
				return (( value >= a) && (value <= b));
			}		 
		} catch (Exception e){
			return false;
		}
		return false;
	}

	public String getObservationDate() {
		return observationDate;
	}

	public void setObservationDate(String observationDate) {
		this.observationDate = observationDate;
	}
}
