package me.kunzou.primefaces.service;

public interface CachingService {
  String CACHE = "CACHE";

  void clearAllCache();
  void removeCustomer(Long id);
  void removeFilm(Long id);
}
