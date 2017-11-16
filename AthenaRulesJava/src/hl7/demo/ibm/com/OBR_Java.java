package hl7.demo.ibm.com;

import java.util.*;

public class OBR_Java {
  protected List<OBX_Java> obxList = new Vector<OBX_Java>();
  protected Map<String, OBX_Java> obxMapByID = new HashMap<String, OBX_Java>();
  protected Map<String, OBX_Java> obxMapByName = new HashMap<String, OBX_Java>();
  protected String orderName;
  protected String orderID;
  protected String orderDate;
  protected Date   date;
  protected String orderValue;  
  protected boolean isReportable;
  protected boolean isRereportable;
  protected boolean isSent;
  
  protected String CustomProfileNumber;
  protected String PriorityOrException;
  protected String OrderCodeActionCode;
  protected String OrderCodeStat;
  protected String TIQFlag;
  protected String BStationCode;
  protected String CancelOrderFlag;
  
public static OBR_Java create(){
	return new OBR_Java();
}
  
public List<OBX_Java> getObxList() {
	return obxList;
}
public void addObx(OBX_Java obx) {
	this.obxList.add(obx);
	this.obxMapByID.put(obx.observationID, obx);
	this.obxMapByName.put(obx.observationName, obx);
}

public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public String getOrderValue() {
	return orderValue;
}
public void setOrderValue(String orderValue) {
	this.orderValue = orderValue;
}
public boolean isReportable() {
	return isReportable;
}
public void setReportable(boolean isReportable) {
	this.isReportable = isReportable;
}
public boolean isRereportable() {
	return isRereportable;
}
public void setRereportable(boolean isRereportable) {
	this.isRereportable = isRereportable;
}
public boolean isSent() {
	return isSent;
}
public void setSent(boolean isSent) {
	this.isSent = isSent;
}

public OBX_Java getOBX(String id){
	OBX_Java obx = obxMapByID.get(id);
	if (obx == null)
		obx = obxMapByName.get(id);
		    
	return obx;
}

public OBX_Java getObxByID(String s) {
	return obxMapByID.get(s);
}

public OBX_Java getObxByName(String s) {
	return obxMapByName.get(s);
}

public String getOrderID() {
	return orderID;
}

public void setOrderID(String orderID) {
	this.orderID = orderID;
}

public String getOrderDate() {
	return orderDate;
}

public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
	// TTD - convert date and store as date
	this.date = new Date();
}

public String getCustomProfileNumber() {
	return CustomProfileNumber;
}

public void setCustomProfileNumber(String customProfileNumber) {
	CustomProfileNumber = customProfileNumber;
}

public String getPriorityOrException() {
	return PriorityOrException;
}

public void setPriorityOrException(String priorityOrException) {
	PriorityOrException = priorityOrException;
}

public String getOrderCodeActionCode() {
	return OrderCodeActionCode;
}

public void setOrderCodeActionCode(String orderCodeActionCode) {
	OrderCodeActionCode = orderCodeActionCode;
}

public String getOrderCodeStat() {
	return OrderCodeStat;
}

public void setOrderCodeStat(String orderCodeStat) {
	OrderCodeStat = orderCodeStat;
}

public String getTIQFlag() {
	return TIQFlag;
}

public void setTIQFlag(String tIQFlag) {
	TIQFlag = tIQFlag;
}

public String getBStationCode() {
	return BStationCode;
}

public void setBStationCode(String bStationCode) {
	BStationCode = bStationCode;
}

public String getCancelOrderFlag() {
	return CancelOrderFlag;
}

public void setCancelOrderFlag(String cancelOrderFlag) {
	CancelOrderFlag = cancelOrderFlag;
}
}
