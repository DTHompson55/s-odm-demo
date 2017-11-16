package hl7.demo.ibm.com;

public class TheClient {
	public boolean acceptsPartials;
	public boolean acceptsRereportables;
	
	public static TheClient create(){ return new TheClient();}
}
