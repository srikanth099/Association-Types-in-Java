package org.Friday.assosiation.main;

import org.Friday.assosiation.repository.AssosiationRepository1;
import org.Friday.assosiationtype.onetoone.Robot;
import org.Friday.assosiationtype.onetoone.RobotInformation;

public class Robot_Information {
	public static void main(String[] args) {
		RobotInformation information = new RobotInformation();
		information.setInternetProtocol(45485455);
		information.setNetworkAddressTrancilation("NAT5415744454");
		information.setNeuralSchema("10041YNS");
		information.setSerialNumber("GHS54855244");
		information.setSoftwareVersion("15.34 VOS");

		Robot robot = new Robot();
		robot.setMetal("TITANIUM");
		robot.setModelName("CR42");
		robot.setPerposeOfRobot("Humanoid");
		robot.setProductName("Cassy");

		information.setRobot(robot);
		AssosiationRepository1 repository1 = new AssosiationRepository1();
		repository1.saveRobotDetails(robot);

	}
}
