package gov.adlnet.xapi.model;

import java.util.UUID;

public class StatementReference {
	private String objectType;
	private UUID id;
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
}