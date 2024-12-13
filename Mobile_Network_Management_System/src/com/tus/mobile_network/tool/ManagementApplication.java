package com.tus.mobile_network.tool;
import com.tus.mobile_network.tus_private_network.BaseStation2G;
import com.tus.mobile_network.tus_private_network.BaseStation5G;
import com.tus.mobile_network.tus_private_network.BaseStationCabinet;
import com.tus.mobile_network.tus_private_network.CountryConstants;
import com.tus.mobile_network.tus_private_network.Generator;
import com.tus.mobile_network.tus_private_network.Site;

import java.util.*;
import java.util.function.Predicate;

public class ManagementApplication {

	public static void main(String[] args)  
	{ 
		
		Scanner in = new Scanner(System.in);
		// ANSI escape code constants for text colors
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        Generator g = new Generator("Back Up Generator", 1);
		
		while (true)
			{
			// Welcome message
			System.out.print(GREEN + "*********************** Mobile Network Management System ******************************\n\n"+RESET);

			System.out.print(RED + "MAIN MENU:\n" +RESET);

			
			// User prompted to enter choice
			System.out.print("Enter 1 to add a Management System.\n");
			System.out.print("Enter 2 to add a Base Station.\n");
			System.out.print("Enter q to quit.\n");
		
			
			String choice = in.nextLine();
			
			
			// Add a management system
			if(choice.equals("1"))
			{
				// Default Welcome Message
				System.out.print(GREEN + "*****************************************************\n");
				System.out.print("Welcome, what type of Management System would you like to add?\n\n");
				System.out.print("*****************************************************\n"+RESET);
				
				System.out.print("Enter 1 to add a Configuration Management System.\n");
				System.out.print("Enter 2 to add a Fault Management System.\n");
				System.out.print("Press any other key to return to the main menu.\n");
				
				String choice2 = in.nextLine();
				
				if(choice2.equals("1"))
				{
					ConfigurationManagementSystem c = new ConfigurationManagementSystem("Configuration System", true, 1000, 100,5);
					System.out.println(RED + c.name + " was successfully created." + RESET);
				}
				
				if(choice2.equals("2"))
				{
					FaultManagementSystem f = new FaultManagementSystem();
					System.out.println(RED + f.name + " was successfully created." + RESET);
					
				}
				
			}
			
			//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
			// Add a management system
				if(choice.equals("2"))
				{
					// Default Welcome Message
					System.out.print(YELLOW + "*****************************************************\n");
					System.out.print("Welcome, what type of Base Station would you like to add?\n\n");
					System.out.print("*****************************************************\n"+RESET);
					
					System.out.print("Enter 1 to add a 5G Base Station.\n");
					System.out.print("Enter 2 to add a 2G Base Station.\n");
					System.out.print("Press any other key to return to the main menu.\n");
					
					String choice2 = in.nextLine();
					
					if(choice2.equals("1"))
					{
						
						BaseStation5G bs = new BaseStation5G();
						
						System.out.println(RED + bs.getName() + " was successfully created." + RESET);
					}
					
					if(choice2.equals("2"))
					{
						Site site =new Site();
						BaseStation2G bs2g = new BaseStation2G(site, "2G Base Station", 100);
						FaultManagementSystem f = new FaultManagementSystem();
						System.out.println(RED + bs2g.getName() + " was successfully created." + RESET);
						
					}
					
				}
			//bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb
			
			// Add a base station
			if(choice.equals("2"))
			{
									
			}
			
			// Exit the application
			if(choice.equals("q"))
			{
			
				System.exit(0);
			}
			
			}


	}

}
