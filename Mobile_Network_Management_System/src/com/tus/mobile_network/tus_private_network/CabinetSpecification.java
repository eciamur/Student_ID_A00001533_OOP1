
package com.tus.mobile_network.tus_private_network;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public interface CabinetSpecification 
{
	int RACKS = 4; // All cabinets have 4 shelves. This is constant for base station cabinets 
	
	void setPowerSource(String powerSource);  // All cabinets must specify a power source
	
	void setFanUnit(String fanUnit);  // All cabinets must specify a Fan
	
	static String getSpecificationLink()  
	{
	
        return "https://www.3gpp.org/technologies/5g-system-overview"; 	// Full details of the specifications are available from this link  
	}
	
	default String getBatteryStatus()
	{
		getAlarmStatus();
		return "Battery charging while connect to mains power"; 
	}
	
	private void getAlarmStatus()
	{
		System.out.println("Alarm Disconnected");
	}
	

}
