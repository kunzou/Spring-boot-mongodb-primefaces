package me.kunzou.primefaces.managedBean;

import javax.annotation.PostConstruct;

public abstract class BaseManagedBean {

	@PostConstruct
	public void init() {
		initBean();
	}

	protected void initBean() {
	}
}
