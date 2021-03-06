package me.kunzou.primefaces.dto;

import java.time.LocalDateTime;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CustomerRental {
  @Field("Film Title")
  private String filmTitle;
  @Field("Rental Date")
  private LocalDateTime dateOfRental;
  @Field("Duration of Rental")
  private Integer durationOfRental;
  @Field("Cost of Rental")
  private Double costOfRental;

  public CustomerRental(String filmTitle, LocalDateTime dateOfRental, Integer durationOfRental, Double costOfRental) {
    this.filmTitle = filmTitle;
    this.dateOfRental = dateOfRental;
    this.durationOfRental = durationOfRental;
    this.costOfRental = costOfRental;
  }
}
