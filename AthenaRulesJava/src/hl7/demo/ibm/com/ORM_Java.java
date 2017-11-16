package hl7.demo.ibm.com;


public class ORM_Java {
	protected class OrderInfo {
		public String orderCode; 
		public String orderCodeNM; 
		public String unitNumber;}
	

	protected java.util.Map<String, OrderInfo> orderMap = new java.util.HashMap<String, OrderInfo>();
	
	
	protected String orderTemplate = 
			"MSH|^~||||AT|||ORM^A^M|1^U^3101483\n"+
			"PID|1|123^|#ACCESSIONID^^^ACCN||TEST^REFERRALS^||^19610101|F^|||^^^^|||||||123||\n"+
			"PV1|1||^^^|||||||||||||||||||||||||||||||||||Y|||||||\n"+
			"ORC|NW||||||PE~1^SS~2^IC~1^OT=CARD~1^L~1||201607061355^|||^^^PAIC|AT||201609090600|N|HQTEST|J|HQDB03^HQDB03||^^FX^^^^^^^|CLIN|\n"+
			"OBR|1|#ACCESSIONID||#ORDERCODE^^#UNITCODE^#ORDERCODENM^#ORDERCODE^^^^^|||||||A||||||||AT|T||||||\n"+
			"ZSI|01|^^^#ORDERCODENM|1^1|SPECLBL|IC||||N^N^^0|#ORDERCODE\n";
	
	public String generateOrder(String OrderCode, String AccessionID) {
		
		return "";
		}
	public static ORM_Java create() {return new ORM_Java();}

}
