package me.kunzou.primefaces.converter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LocalDateTimeStringConverter implements Converter<String, LocalDateTime> {
  public static final String DATE_FORMATTER= "yyyy-MM-dd HH:mm:ss.S";

  @Override
  public LocalDateTime convert(String source) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
    return LocalDateTime.parse(source, formatter);
  }
}
