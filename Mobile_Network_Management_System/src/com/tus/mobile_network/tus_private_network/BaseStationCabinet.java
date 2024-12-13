package com.tus.mobile_network.tus_private_network;


public final class BaseStationCabinet implements CabinetSpecification, SiteConstants, PowerSource 
{
	String powerSource;
	String fanUnit;

	@Override
	public void setPowerSource(String powerSource) 
	{
		this.powerSource = powerSource; 
	}

	@Override
	public void setFanUnit(String fanUnit) 
	{
		this.fanUnit  = fanUnit;
	}
	
	public int getNumRacks()
	{
		return RACKS;
	}
	
	public int getVoltage()
	{
		return VOLTAGE;
	}
	
	public String getOperator()
	{
		return OPERATOR;
	}
	
	public int getMaxAllowed()
	{
		return MAX_PEOPLE_ALLOWED_ON_SITE;
	}
	
	public String getCountryName()
	{
		return COUNTRY_NAME;
	}
	
	public boolean getRedundencyStatus()
	{
		return REDUNDENCY_REQUIRED;
	}
	
	public double getNetworkAvailability()
	{
		return CountryConstants.NETWORK_AVAILABILITY;
	}

	@Override
	public void checkPowerSource() 
	{
		System.out.println("Power source is enabled");
	}
	
	
	

}
