package me.kunzou.primefaces.dto;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.kunzou.primefaces.domain.Film;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FilmInformation {
  private List<CustomerInformation> customers;
  private Film film;

  public FilmInformation(List<CustomerInformation> customers, Film film) {
    this.customers = customers;
    this.film = film;
  }

  public List<CustomerInformation> getCustomers() {
    if(customers == null) {
      customers = new ArrayList<>();
    }
    return customers;
  }
}
