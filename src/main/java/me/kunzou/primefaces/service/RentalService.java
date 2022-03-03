package me.kunzou.primefaces.service;

import java.util.List;
import me.kunzou.primefaces.domain.Customer;
import me.kunzou.primefaces.domain.Film;
import me.kunzou.primefaces.dto.AvailableFilm;
import me.kunzou.primefaces.dto.CustomerInformation;
import me.kunzou.primefaces.dto.FilmInformation;

public interface RentalService {
  List<Customer> getAllCustomers();
  List<AvailableFilm> getAvailableFilms();
  FilmInformation getFilmInformation(Long id);
  CustomerInformation getCustomerInformation(Long id);
  List<Customer> findByName(String keyword);
  List<Film> findByActorName(String keyword);
}
