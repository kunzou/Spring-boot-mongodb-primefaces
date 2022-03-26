package me.kunzou.primefaces.domain;

import java.math.BigDecimal;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RateCard {
	private String name;
	private BigDecimal buyRate;
	private BigDecimal maxFee;
	private BigDecimal overageSplit;
	private BigDecimal nbAdjustment;
	private BigDecimal regAdjustment;

/*	public RateCard(String name, BigDecimal buyRate, BigDecimal maxFee, BigDecimal overageSplit, BigDecimal nbAdjustment, BigDecimal regAdjustment) {
		this.name = name;
		this.buyRate = buyRate;
		this.maxFee = maxFee;
		this.overageSplit = overageSplit;
		this.nbAdjustment = nbAdjustment;
		this.regAdjustment = regAdjustment;
	}*/
}
