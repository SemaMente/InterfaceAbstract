package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	
	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		
	}

	public  void Save(Customer customer) {
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.print("Saved : " + customer.getFirstName());
			
		}else {
			System.out.print("Not a valid person");
		}
		
		
	}
}
