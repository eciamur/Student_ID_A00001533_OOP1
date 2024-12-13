package com.tus.mobile_network.tus_private_network;
import java.util.ArrayList; // import the ArrayList class
import java.util.function.Predicate;


public class BaseStation2G extends BaseStation  
{
	private Site site = new Site();
	private String name;
	private int id;
	ConnectionSpeed gsm = ConnectionSpeed.FAST;	// Demonstrating enum
	
	// Declare an array of antenna units
	String[] antennaUnits = new String[3]; 
	
	// String Builder example
	StringBuilder sb = new StringBuilder("Base Station");
	int maxCables = 10; 

	
	
	 
	public BaseStation2G(Site site, String name, int id)
	{
		Predicate<Integer> validateID = i -> (i > -1);
		System.out.println("Valid ID " + validateID.test(id));
		
		this.site = site;
		this.name = name;
		this.id = id;
		gsm.setConnectionSpeed(300);
		this.calculateDataRate(gsm);
		 
		// initialize array of antenna units to their positions
		antennaUnits[0] = "Position 1";
		antennaUnits[1] = "Position 2";
		antennaUnits[2] = "Position 3";
		
		// String Builder appending 2G
		sb.append(" 2G");
		
		ArrayList<String> processingBoard = new ArrayList<String>(); // Create an ArrayList object
		processingBoard.add("Rack Position 1");
		processingBoard.add("Rack Position 2");
		processingBoard.add("Rack Position 3");
		setCables(maxCables);
	}
	
	public BaseStation2G()
	{
		this.site = null;
		this.name = "";
		this.id = 0;
		gsm.setConnectionSpeed(300);
		this.calculateDataRate(gsm);
		
		// initialize array of antenna units to their positions
		antennaUnits[0] = "Position 1";
		antennaUnits[1] = "Position 2";
		antennaUnits[2] = "Position 3";
		
		// String Builder example
		sb.append(" 2G");
		
	}
	
	private static void calculateDataRate(ConnectionSpeed connectionSpeed) {
		
		switch(connectionSpeed) {
		case FAST:
			System.out.println("Data rate is " + (connectionSpeed.getConnectionSpeed() * 100000 ));
			break;
		case MEDIUM:
			System.out.println("Data rate is " + (connectionSpeed.getConnectionSpeed() * 1000 ));
			break;
			
		case SLOW:
			System.out.println("Data rate is " + (connectionSpeed.getConnectionSpeed() * 10 ));
			break;
		}
		
	}
	
	public String getName()
	{
		return this.name; 
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public void setPower(int antennaPower) //overriding abstract method. DO you override an abstract method? termonology
	{
		this.antennaPower = antennaPower;	
	}
	
	@Override
	public void tiltAntenna()  //overriding non abstract method
	{
		antennaTilt +=2;
	}
	
	private void setCables(int maxCables)
	{
		maxCables +=1;
	}
	
		

}
