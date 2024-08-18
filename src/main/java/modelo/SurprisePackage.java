package modelo;

public class SurprisePackage {
	
	private int idPackage;
	private String description;
	private String modificationType;
	private int modificationValue;
	
	/**
	 * Empty Constructor
	 */
	
	public SurprisePackage() {
		
	}
	
	/**
	 * Full Constructor
	 * 
	 * @param idPackage
	 * @param description
	 * @param modificationType
	 * @param modificationValue
	 */
	
	public SurprisePackage(int idPackage, String description, String modificationType, int modificationValue) {
		super();
		this.idPackage = idPackage;
		this.description = description;
		this.modificationType = modificationType;
		this.modificationValue = modificationValue;
	}
	

	public int getIdPackage() {
		return idPackage;
	}

	public void setIdPackage(int idPackage) {
		this.idPackage = idPackage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getModificationType() {
		return modificationType;
	}

	public void setModificationType(String modificationType) {
		this.modificationType = modificationType;
	}

	public int getModificationValue() {
		return modificationValue;
	}

	public void setModificationValue(int modificationValue) {
		this.modificationValue = modificationValue;
	}

	
	@Override
	public String toString() {
		return "SurprisePackage [idPackage=" + idPackage + ", description=" + description + ", modificationType="
				+ modificationType + ", modificationValue=" + modificationValue + "]";
	}
	

}
