package hl7.demo.ibm.com;
import java.util.*;

public class ORU_Java {

	protected List<OBR_Java> obrList = new Vector<OBR_Java>();
	protected java.util.HashMap<String, OBR_Java> obrMapByID   = new java.util.HashMap<String, OBR_Java>();
	protected java.util.HashMap<String, OBR_Java> obrMapByName = new java.util.HashMap<String, OBR_Java>();
	protected java.util.HashMap<String, OBX_Java> obxMapByID   = new java.util.HashMap<String, OBX_Java>();
	protected java.util.HashMap<String, OBX_Java> obxMapByName = new java.util.HashMap<String, OBX_Java>();
	protected boolean someReportsAreReady;
	protected boolean allReportsAreReady;
	protected String Facility;
	protected String LocationState;
	protected String LocationCity;
	private   HL7_Helper helper = HL7_Helper.create();
	
	public static ORU_Java create(){
		return new ORU_Java();
	}
	
	public OBR_Java createOBR_Java(String id, String name){
		OBR_Java obr = OBR_Java.create();
		obrList.add(obr);
		obrMapByID.put(id, obr);
		obrMapByName.put(name, obr);
		return obr;
	}

	public OBX_Java createOBX_Java(OBR_Java obr, String id, String name){
		OBX_Java obx = OBX_Java.create();
		obx.setobservationID(id);
		obx.setobservationName(name);
		obr.addObx(obx);
		obxMapByID.put(id, obx);
		obxMapByName.put(name, obx);
		return obx;
	}
	
    public boolean isSomeReportsAreReady(){    	
    	return this.someReportsAreReady;
    }
    
    public boolean isAllReportsAreReady(){    	
    	return this.allReportsAreReady;
    }
    
	public OBR_Java getOBR(String id){
		OBR_Java obr = obrMapByID.get(id);
		if (obr == null)
			obr = obrMapByName.get(id);
			    
		return obr;
	}
	
	public OBX_Java getOBX(String id){
		OBX_Java obx = obxMapByID.get(id);
		if (obx == null)
			obx = obxMapByName.get(id);
			    
		return obx;
	}

	public List<OBR_Java> getObrList() {
		return obrList;
	}

	protected java.util.HashMap<String, OBR_Java> getObrMapByName() {
		return obrMapByName;
	}

	protected java.util.HashMap<String, OBX_Java> getObxMapByID() {
		return obxMapByID;
	}

	protected java.util.HashMap<String, OBX_Java> getObxMapByName() {
		return obxMapByName;
	}

	public OBR_Java getObrByID(String s) {
		return obrMapByID.get(s);
	}

	public OBR_Java getObrByName(String s) {
		return obrMapByName.get(s);
	}

	public OBX_Java getObxByID(String s) {
		return obxMapByID.get(s);
	}

	public OBX_Java getObxByName(String s) {
		return obxMapByName.get(s);
	}

	
	
	
	public void setSomeReportsAreReady(boolean someReportsAreReady) {
		this.someReportsAreReady = someReportsAreReady;
	}


	public void setAllReportsAreReady(boolean allReportsAreReady) {
		this.allReportsAreReady = allReportsAreReady;
	}

	public String getFacility() {
		return Facility;
	}

	public void setFacility(String facility) {
		Facility = facility;
		this.LocationCity = helper.getCityFromLocation(facility);
		this.LocationState = helper.getStateFromLocation(facility);
	}

	public String getLocationState() {
		return LocationState;
	}

	public String getLocationCity() {
		return LocationCity;
	}


}
