package hl7.demo.ibm.com;

import java.util.*;

public class HL7_Helper {

	protected Map<String, String> events = new HashMap<String, String> ();
	protected String eventsInitializer[][] = new String[][]{
		{"TSH","5600000899"},
		{"CBC","3100006399"},
		{"Chemistry","2600070083"},
		{"Microbiology","2600070083"}};

	protected Map<String, String> locationCityMap = new HashMap<String, String> ();
	protected String locationsCitiesInitializer[][] = new String[][]{
			{"AH", "Auburn Hills"},
			{"AT", "Tucker"},
			{"BA", "Baltimore"},
			{"BA", "Bayamon"},
			{"CI", "Cincinnati"},
			{"DN", "Denver"},
			{"HO", "Houston"},
			{"HR", "Horsham"},
			{"IR", "Irving"},
			{"LE", "Lenexa"},
			{"LI", "Lincoln"},
			{"LV", "Las Vegas"},
			{"MA", "Marlborough"},
			{"MI", "Miramar"},
			{"MS", "Mason"},
			{"PB", "Palm Beach Gardens"},
			{"PI", "Pittsburgh"},
			{"PO", "Portland"},
			{"RP", "Rio Piedras"},
			{"SA", "Sacramento"},
			{"SC", "Schaumburg"},
			{"SE", "Seattle"},
			{"SJ", "San Jose"},
			{"SL", "St. Louis"},
			{"SU", "San Juan Capistrano"},
			{"SY", "Syosset"},
			{"TA", "Tampa"},
			{"TE", "Teterboro"},
			{"WD", "Wood Dale"},
			{"WF", "Wallingford"},
			{"WH", "West Hills"}};

	protected Map<String, String> cityStateMap = new HashMap<String, String> ();
	protected String cityStatesInitializer[][] = new String[][]{
			{"Northridge", "CA"},
			{"Sacramento", "CA"},
			{"San Jose", "CA"},
			{"San Juan Capistrano", "CA"},
			{"Valencia", "CA"},
			{"West Hills", "CA"},
			{"Denver", "CO"},
			{"Wallingford", "CT"},
			{"Miramar", "FL"},
			{"Palm Beach Gardens", "FL"},
			{"Tampa", "FL"},
			{"Tucker", "GA"},
			{"Schaumburg", "IL"},
			{"Wood Dale", "IL"},
			{"Lenexa", "KS"},
			{"Marlborough", "MA"},
			{"Baltimore", "MD"},
			{"Auburn Hills", "MI"},
			{"St. Louis", "MO"},
			{"Lincoln", "NE"},
			{"Teterboro", "NJ"},
			{"Las Vegas", "NV"},
			{"Syosset", "NY"},
			{"Cincinnati", "OH"},
			{"Mason", "OH"},
			{"Portland", "OR"},
			{"Collegeville", "PA"},
			{"Horsham", "PA"},
			{"Pittsburgh", "PA"},
			{"Bayamon", "PR"},
			{"Rio Piedras", "PR"},
			{"San Juan", "PR"},
			{"Houston", "TX"},
			{"Irving", "TX"},
			{"Chantilly", "VA"},
			{"Seattle", "WA"},};
	
	public static HL7_Helper create() {return new HL7_Helper();}
	
	public HL7_Helper(){
		for (int i = 0; i < eventsInitializer.length; i++) {
		    events.put(eventsInitializer[i][0], eventsInitializer[i][1]);
		}
		for (int i = 0; i < this.cityStatesInitializer.length; i++) {
		    events.put(cityStatesInitializer[i][0], cityStatesInitializer[i][1]);
		}
		for (int i = 0; i < locationsCitiesInitializer.length; i++) {
		    events.put(locationsCitiesInitializer[i][0], this.locationsCitiesInitializer[i][1]);
		}
	}
	
	public String getStateFromLocation(String s){
		try {
		String c = this.locationCityMap.get(s);
		return this.cityStateMap.get(c);
		} catch (Exception e){}
		return "";
	}
	public String getCityFromLocation(String s){
		try {
		String c = this.locationCityMap.get(s);
		return c;
		} catch (Exception e){}
		return "";
	}
	
	public String getEventType(String unitCode){return "";}
	public String getMedicalConditionFromICD(String icdCode){return "";}
	
	public static boolean stringToBoolean(String s){try{return Boolean.parseBoolean(s);} catch (Exception e){} return false;}
	public static String booleanToString(boolean b){try{return String.valueOf(b);} catch (Exception e){} return "false";}
	public static int stringToInt(String s){try{return Integer.parseInt(s);} catch (Exception e){} return 0;}
	public static String intToString(int b){try{return String.valueOf(b);} catch (Exception e){} return "0";}
	public static double stringToDouble(String s){try{return Double.parseDouble(s);} catch (Exception e){} return 0.0;}
	public static String doubleToString(double b){try{return String.valueOf(b);} catch (Exception e){} return "0.0";}
	
	
}
