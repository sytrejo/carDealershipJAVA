package carDealership;

public class Employee {
	
	public void handleCustomer( Customer cust, boolean finance, Vehicle vehicle) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand()
		}
	}

}
