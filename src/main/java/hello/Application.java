package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	
	 public static void main(String[] args) {
	        SpringApplication.run(Application.class);
	    }
	
	@Override
	public void run(String... arg0) throws Exception {
		customerRepository.save(new Customer("Nik","Thakur"));
		customerRepository.save(new Customer("Joe","Blue"));
		customerRepository.save(new Customer("Keith","Skronek"));
		customerRepository.save(new Customer("Steven","Byks"));
		System.out.println("Found Customers are");
		for(Customer customer: customerRepository.findAll()){
			System.out.println(customer.toString());
		}
	}
	
}
