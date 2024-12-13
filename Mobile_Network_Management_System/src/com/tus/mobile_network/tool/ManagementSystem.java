package com.tus.mobile_network.tool;

public class ManagementSystem 
{
	String name = "None Specified"; 
	Boolean synchronization = false;
	int hardwareId;  
	
	
	ManagementSystem(String name, Boolean synchronization, int hardwareId)
	{
		this.name = name;
		this.synchronization  = synchronization; 
		this.hardwareId = hardwareId; 
		 
	}
	
	ManagementSystem() //No arguments default constructor
	{
		this("Default Management System", false, 0);		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public Boolean getSynchronization()
	{
		return this.synchronization;
	}
	
	public void setSynchronization(Boolean synchronization)
	{
		this.synchronization = synchronization;
	}
	
	public int getHardwareId()
	{
		return this.hardwareId;
	}
	
	public void setHardwareId(int hardwareId)
	{
		this.hardwareId = hardwareId;
	}
	
}
