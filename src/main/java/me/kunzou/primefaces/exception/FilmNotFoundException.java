package me.kunzou.primefaces.exception;

public class FilmNotFoundException extends RuntimeException {

  public FilmNotFoundException(String messageKey,Long id) {
    super(String.format(messageKey, id));
  }
}
