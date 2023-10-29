package it.teoprogramming.sfidi.dependencyinversionprinciple.highlevel;

import it.teoprogramming.sfidi.dependencyinversionprinciple.lowlevel.Fan;
import it.teoprogramming.sfidi.dependencyinversionprinciple.lowlevel.LightBulb;
import org.junit.jupiter.api.Test;

public class ElectricPowerSwitchTest {

	@Test
	public void testPress() throws Exception {
		Switchable switchableBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();

		Switchable switchableFan = new Fan();
		Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
		fanPowerSwitch.press();
		fanPowerSwitch.press();
	}
}
