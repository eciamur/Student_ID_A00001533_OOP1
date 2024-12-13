package com.tus.mobile_network.tus_private_network;

public abstract class BaseStation //ToDo figure out how to "implement" this and add some abstract classes that are implemented in its concrete classes

{
	 
	int antennaTilt = 0;
	int antennaPower = 180; 
	
	public abstract void setPower(int antennaPower);
	
	public void tiltAntenna()   // Tilts antenna 1 degree. 
	{
		antennaTilt +=1;
	}

    public void tiltAntenna(int amount)   // Tilts antenna by "amount" number of degrees
    { 
    	antennaTilt +=amount;
    }
    
    
    public void tiltAntenna(double amount, int iterations)   // Tilts antenna by the decimal value "amount". Repeats "iterations" times.   
    { 
    	for (int i = 1; i <= iterations; i++)
    	{
    		antennaTilt +=amount; 
    	}
    }
    
    public void tiltAntenna(int ... amounts)   // Tilts antenna by each amount provided in ...amounts    
    { 
    	// Using LVTI to declare iteration variable amount in enhanced for loop   
        for (var amount : amounts)
        	antennaTilt +=amount;
    }
    	
    
    
    
    
    
   
}
