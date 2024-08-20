package modelo;

public class Characters {
	
	private int idCharacter;
	private String nameCharacter;
	private String categoryCharacter;
	private String universCharacter;
	private double healthCharacter;
	private double attackCharacter;
	private double defenseCharacter;
	private double speedCharacter;
	private double staminaCharacter;
	private double intelligenceCharacter;
	private double specialCharacter;
	private String imageUrl;
	
	
	/**
	 * Empty Constructor
	 */
	
	public Characters() {
		
	}
	
	/**
	 * Full Constructor
	 * 
	 * @param idCharacter
	 * @param nameCharacter
	 * @param universCharacter
	 * @param healthCharacter
	 * @param attackCharacter
	 * @param defenseCharacter
	 * @param speedCharacter
	 * @param staminaCharacter
	 * @param intelligenceCharacter
	 * @param specialCharacter
	 */
	
	public Characters(int idCharacter, String nameCharacter, String categoryCharacter, String universCharacter, double healthCharacter,
			double attackCharacter, double defenseCharacter, double speedCharacter, double staminaCharacter,
			double intelligenceCharacter, double specialCharacter, String imageUrl) {
		super();
		this.idCharacter = idCharacter;
		this.nameCharacter = nameCharacter;
		this.categoryCharacter =categoryCharacter;
		this.universCharacter = universCharacter;
		this.healthCharacter = healthCharacter;
		this.attackCharacter = attackCharacter;
		this.defenseCharacter = defenseCharacter;
		this.speedCharacter = speedCharacter;
		this.staminaCharacter = staminaCharacter;
		this.intelligenceCharacter = intelligenceCharacter;
		this.specialCharacter = specialCharacter;
		this.imageUrl = imageUrl;
	}
	
	/**
	 * Full Constuctor without idCharacter to be used by the servlets
	 * @param nameCharacter
	 * @param universCharacter
	 * @param healthCharacter
	 * @param attackCharacter
	 * @param defenseCharacter
	 * @param speedCharacter
	 * @param staminaCharacter
	 * @param intelligenceCharacter
	 * @param specialCharacter
	 */
	public Characters(String nameCharacter, String categoryCharacter, String universCharacter, double healthCharacter,
			double attackCharacter, double defenseCharacter, double speedCharacter, double staminaCharacter,
			double intelligenceCharacter, double specialCharacter, String imageUrl) {
		super();
		this.nameCharacter = nameCharacter;
		this.categoryCharacter = categoryCharacter;
		this.universCharacter = universCharacter;
		this.healthCharacter = healthCharacter;
		this.attackCharacter = attackCharacter;
		this.defenseCharacter = defenseCharacter;
		this.speedCharacter = speedCharacter;
		this.staminaCharacter = staminaCharacter;
		this.intelligenceCharacter = intelligenceCharacter;
		this.specialCharacter = specialCharacter;
		this.imageUrl = imageUrl;
	}

	public int getIdCharacter() {
		return idCharacter;
	}

	public void setIdCharacter(int idCharacter) {
		this.idCharacter = idCharacter;
	}

	public String getNameCharacter() {
		return nameCharacter;
	}

	public void setNameCharacter(String nameCharacter) {
		this.nameCharacter = nameCharacter;
	}

	public String getCategoryCharacter() {
		return categoryCharacter;
	}

	public void setCategoryCharacter(String categoryCharacter) {
		this.categoryCharacter = categoryCharacter;
	}

	public String getUniversCharacter() {
		return universCharacter;
	}

	public void setUniversCharacter(String universCharacter) {
		this.universCharacter = universCharacter;
	}

	public double getHealthCharacter() {
		return healthCharacter;
	}

	public void setHealthCharacter(double healthCharacter) {
		this.healthCharacter = healthCharacter;
	}

	public double getAttackCharacter() {
		return attackCharacter;
	}

	public void setAttackCharacter(double attackCharacter) {
		this.attackCharacter = attackCharacter;
	}

	public double getDefenseCharacter() {
		return defenseCharacter;
	}

	public void setDefenseCharacter(double defenseCharacter) {
		this.defenseCharacter = defenseCharacter;
	}

	public double getSpeedCharacter() {
		return speedCharacter;
	}

	public void setSpeedCharacter(double speedCharacter) {
		this.speedCharacter = speedCharacter;
	}

	public double getStaminaCharacter() {
		return staminaCharacter;
	}

	public void setStaminaCharacter(double staminaCharacter) {
		this.staminaCharacter = staminaCharacter;
	}

	public double getIntelligenceCharacter() {
		return intelligenceCharacter;
	}

	public void setIntelligenceCharacter(double intelligenceCharacter) {
		this.intelligenceCharacter = intelligenceCharacter;
	}

	public double getSpecialCharacter() {
		return specialCharacter;
	}

	public void setSpecialCharacter(double specialCharacter) {
		this.specialCharacter = specialCharacter;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
