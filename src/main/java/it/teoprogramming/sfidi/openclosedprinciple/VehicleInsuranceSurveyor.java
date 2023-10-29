package it.teoprogramming.sfidi.openclosedprinciple;

public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
	@Override public boolean isValidClaim() {
		System.out.println("VehicleInsuranceSurveyor: Validating health insurance claim...");
		/*Logic to validate vehicle insurance claims*/
		return true;
	}
}
