package carDealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.setName("Tom");
		cust1.setAddress("123 Here St.");
		cust1.setCashOnHand(12000.00);
		
		Vehicle vehicle = new Vehicle();
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle,  emp, false);
		
		cust1.toString();

	}

}
