package com.tus.mobile_network.tus_private_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class BaseStation5G extends BaseStation 
{
	// Variables are private, and only accessed using getters and setters, demonstrating encapsulation.
	private String name;
	private int id =1;
	
	
	public BaseStation5G(String name, int id)
	{
		this.name = name; 
		this.id = id;
		
	}
	
	public BaseStation5G()
	{

		this.name = "Defaul 5G Base Station";
		this.id = 0;
		
	}
	
	public String getName()
	{
		return this.name; 
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	

	public int getId()
	{
		return this.id; 
	}
	
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	
	@Override
	public void setPower(int antennaPower) //overriding abstract method. DO you override an abstract method? termonology
	{
		this.antennaPower = antennaPower;	
	}
	
	@Override
	public void tiltAntenna()  //overriding non abstract method
	{
		antennaTilt +=2;
	}
	

	public void getSpecifications() throws IOException
	{
		//Print Specification to console in HTML format
		URL oracle = new URL("https://www.3gpp.org/technologies/5g-system-overview");
		URLConnection yc = oracle.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(
		                            yc.getInputStream()));
		 String inputLine;
	        while ((inputLine = in.readLine()) != null) 
	            System.out.println(inputLine);
	        in.close();
		
	}
	
	
		

}
