package me.kunzou.primefaces.managedBean;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.model.file.UploadedFile;
import org.springframework.stereotype.Component;
import me.kunzou.primefaces.domain.RateCard;

@Component
@ManagedBean
@SessionScoped
public class RateCardManagedBean {

	public static List<RateCard> rateCards;

	@PostConstruct
	public void init() {
		rateCards = new ArrayList<>();
	}

	public void onRowEdit(RowEditEvent<RateCard> event) {
//		FacesMessage msg = new FacesMessage("Product Edited", String.valueOf(event.getObject().getName()));
//		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onRowCancel(RowEditEvent<RateCard> event) {
//		FacesMessage msg = new FacesMessage("Edit Cancelled", String.valueOf(event.getObject().getName()));
//		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onAddNew() {
		// Add one new product to the table:
		RateCard rateCard = new RateCard();
		rateCards.add(rateCard);

//		FacesMessage msg = new FacesMessage("New Rate Card added");
//		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void fileUploadListener(FileUploadEvent event) {
		UploadedFile file = event.getFile();
		if (file != null && file.getContent() != null && file.getContent().length > 0 && file.getFileName() != null) {
			FacesMessage msg = new FacesMessage("Successful", file.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, msg);

		}
	}

	public void delete(RateCard rateCard) {
		rateCards.remove(rateCard);
	}

	public List<RateCard> getRateCards() {
		return rateCards;
	}
}
