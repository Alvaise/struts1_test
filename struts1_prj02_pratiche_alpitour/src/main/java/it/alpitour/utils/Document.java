package it.alpitour.utils;

public class Document {
	
	private String agencyNumber;
	private String brand;
	private String schema;
	private String state;
	private String acceptUrl;
	private String travelDocumentUrl;
	private String previsionaliOmaggiUrl;
	
	public Document(String agencyNumber, String brand, String schema, String state, String acceptUrl,
			String travelDocumentUrl, String previsionaliOmaggiUrl) {
		this.agencyNumber = agencyNumber;
		this.brand = brand;
		this.schema = schema;
		this.state = state;
		this.acceptUrl = acceptUrl;
		this.travelDocumentUrl = travelDocumentUrl;
		this.previsionaliOmaggiUrl = previsionaliOmaggiUrl;
	}

	/**
	 * @return the agencyNumber
	 */
	public String getAgencyNumber() {
		return agencyNumber;
	}

	/**
	 * @param agencyNumber the agencyNumber to set
	 */
	public void setAgencyNumber(String agencyNumber) {
		this.agencyNumber = agencyNumber;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the schema
	 */
	public String getSchema() {
		return schema;
	}

	/**
	 * @param schema the schema to set
	 */
	public void setSchema(String schema) {
		this.schema = schema;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the acceptUrl
	 */
	public String getAcceptUrl() {
		return acceptUrl;
	}

	/**
	 * @param acceptUrl the acceptUrl to set
	 */
	public void setAcceptUrl(String acceptUrl) {
		this.acceptUrl = acceptUrl;
	}

	/**
	 * @return the travelDocumentUrl
	 */
	public String getTravelDocumentUrl() {
		return travelDocumentUrl;
	}

	/**
	 * @param travelDocumentUrl the travelDocumentUrl to set
	 */
	public void setTravelDocumentUrl(String travelDocumentUrl) {
		this.travelDocumentUrl = travelDocumentUrl;
	}

	/**
	 * @return the previsionaliOmaggiUrl
	 */
	public String getPrevisionaliOmaggiUrl() {
		return previsionaliOmaggiUrl;
	}

	/**
	 * @param previsionaliOmaggiUrl the previsionaliOmaggiUrl to set
	 */
	public void setPrevisionaliOmaggiUrl(String previsionaliOmaggiUrl) {
		this.previsionaliOmaggiUrl = previsionaliOmaggiUrl;
	}
	
	
}
