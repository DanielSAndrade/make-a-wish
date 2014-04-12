package com.ciandt.hackathon.entity.enumx;

public enum BadgeEnum {

	BRONZE(1L), PRATA(2L), OURO(3L);

	private final Long id;

	BadgeEnum(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

}
