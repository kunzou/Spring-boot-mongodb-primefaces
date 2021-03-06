package me.kunzou.primefaces.exception;

public class CustomerNotFoundException extends RuntimeException {
  private Long id;
  public CustomerNotFoundException(String messageKey, Long id) {
    super(String.format(messageKey, id));
  }
}
