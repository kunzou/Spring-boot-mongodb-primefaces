package me.kunzou.primefaces.service;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class CachingServiceImpl implements CachingService {

  private CacheManager cacheManager;

  public CachingServiceImpl(CacheManager cacheManager) {
    this.cacheManager = cacheManager;
  }

  @Override
  @CacheEvict(value = CACHE, allEntries = true)
  public void clearAllCache() {
  }

  @Override
  @CacheEvict(value = CACHE, key = "#id")
  public void removeCustomer(Long id) {
  }

  @Override
  @CacheEvict(value = CACHE, key = "-#id")
  public void removeFilm(Long id) {
  }
}
