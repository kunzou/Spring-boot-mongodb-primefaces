package me.kunzou.primefaces.controller;

import java.util.Collection;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import me.kunzou.primefaces.domain.RateCard;
import me.kunzou.primefaces.managedBean.RateCardManagedBean;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping(value = "/rateCards", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<RateCard>> getCustomers() {
		return ResponseEntity.ok().body(RateCardManagedBean.rateCards);
	}
}
