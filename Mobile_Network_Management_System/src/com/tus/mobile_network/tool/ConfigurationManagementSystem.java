package com.tus.mobile_network.tool;

public class ConfigurationManagementSystem extends ManagementSystem
{
	
	int cell_configuration = 100;
	int cell_relation = 5;
	

	ConfigurationManagementSystem(String name, Boolean synchronization, int hardwareId, int cell_configuration,int cell_relation) 
	{
		super(name, synchronization, hardwareId); //match constructor of parent class ManagementSystem 
		
		this.cell_configuration  = cell_configuration;
		this.cell_relation  = cell_relation;
	    System.out.println("Creating " +super.name + "...");
	
	}

}
