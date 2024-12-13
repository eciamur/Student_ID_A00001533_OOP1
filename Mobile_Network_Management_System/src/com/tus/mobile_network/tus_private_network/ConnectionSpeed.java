package com.tus.mobile_network.tus_private_network;

public enum ConnectionSpeed 
{
	FAST(10000),
	MEDIUM(5000),
	SLOW(200);
	
	private int connectionSpeed;
	
	ConnectionSpeed(int connectionSpeed)
	{
		this.connectionSpeed = connectionSpeed;
	}
	
	public int getConnectionSpeed() {
		return connectionSpeed;
	}

	public void setConnectionSpeed(int connectionSpeed) {
		this.connectionSpeed = connectionSpeed;
	}

}





 