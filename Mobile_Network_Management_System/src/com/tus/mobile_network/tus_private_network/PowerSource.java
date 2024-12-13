package com.tus.mobile_network.tus_private_network;

public sealed interface PowerSource permits BaseStationCabinet 
{
	void checkPowerSource();
}
