/**
 * 
 */
package com.inventwheel.patterns.abstract_factory;

/**
 * @author sansor
 *
 */
public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Computer computer = ComputerFactory.getComputer(ComputerFactory.PC_COMPUTER);
		System.out.println(computer.getMonitor().getSpecification());
		System.out.println(computer.getProcessor().getSpecification());
		System.out.println(computer.getRAM().getSpecification());
	}

}
