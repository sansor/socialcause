package com.inventwheel.patterns.abstract_factory;

public class ComputerFactory {

	public static String PC_COMPUTER ="pc";
	public static String SERVER_COMPUTER ="server";
	public static String WS_COMPUTER ="ws";
	
	public static Computer getComputer(String compType){
		if(compType.equalsIgnoreCase(PC_COMPUTER)){
			return new PC();
		}else if(compType.equalsIgnoreCase(SERVER_COMPUTER)){
			return new Server();
		}else{
			return new Workstation();
		}
	}
}
