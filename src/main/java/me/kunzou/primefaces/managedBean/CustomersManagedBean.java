package me.kunzou.primefaces.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import me.kunzou.primefaces.domain.Customer;
import me.kunzou.primefaces.service.RentalService;

@Component
@ManagedBean
@ViewScoped
public class CustomersManagedBean extends BaseManagedBean {
	private RentalService rentalService;
	private List<Customer> customers;

	@Autowired
	public CustomersManagedBean(RentalService rentalService) {
		this.rentalService = rentalService;
	}

	@Override
	protected void initBean() {
		customers = rentalService.getAllCustomers();
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public String getName(Customer customer) {
		return String.format("%s %s", customer.getFirstName(), customer.getLastName());
	}

	public String getAddress(Customer customer) {
		return String.format("%s, %s, %s", customer.getAddress(), customer.getCity(), customer.getCountry());
	}
}
