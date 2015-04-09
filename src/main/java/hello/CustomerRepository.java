package hello;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	Collection<Customer> findByLastName(String lastname);

}
