
import java.util.Date;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerService;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Program {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.Save(new Customer(1, "Sema", "Mente", new Date(2000), "123456"));

		System.out.println();
		
	
	}

}
