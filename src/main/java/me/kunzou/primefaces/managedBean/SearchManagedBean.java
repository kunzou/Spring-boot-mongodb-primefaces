package me.kunzou.primefaces.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import me.kunzou.primefaces.domain.Customer;
import me.kunzou.primefaces.domain.Film;
import me.kunzou.primefaces.service.RentalService;

@Component
@ManagedBean
@ViewScoped
public class SearchManagedBean extends BaseManagedBean {
	private RentalService rentalService;
	private List<Customer> customers;
	private List<Film> films;
	private String keyword;

	@Autowired
	public SearchManagedBean(RentalService rentalService) {
		this.rentalService = rentalService;
	}

	public void searchAction() {
		customers = rentalService.findByName(keyword);
		films = rentalService.findByActorName(keyword);
	}

	public String getName(Customer customer) {
		return String.format("%s %s", customer.getFirstName(), customer.getLastName());
	}

	public String getAddress(Customer customer) {
		return String.format("%s, %s, %s", customer.getAddress(), customer.getCity(), customer.getCountry());
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public List<Film> getFilms() {
		return films;
	}
}
