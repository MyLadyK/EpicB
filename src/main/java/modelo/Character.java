package modelo;

public class Character {
	
	private int idCharacter;
	private String nameCharacter;
	private String universCharacter;
	private double healthCharacter;
	private double attackCharacter;
	private double defenseCharacter;
	private double speedCharacter;
	private double staminaCharacter;
	private double intelligenceCharacter;
	private double specialCharacter;
	
	
	/**
	 * Empty Constructor
	 */
	
	private Character() {
		
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
	
	private Character(int idCharacter, String nameCharacter, String universCharacter, double healthCharacter,
			double attackCharacter, double defenseCharacter, double speedCharacter, double staminaCharacter,
			double intelligenceCharacter, double specialCharacter) {
		super();
		this.idCharacter = idCharacter;
		this.nameCharacter = nameCharacter;
		this.universCharacter = universCharacter;
		this.healthCharacter = healthCharacter;
		this.attackCharacter = attackCharacter;
		this.defenseCharacter = defenseCharacter;
		this.speedCharacter = speedCharacter;
		this.staminaCharacter = staminaCharacter;
		this.intelligenceCharacter = intelligenceCharacter;
		this.specialCharacter = specialCharacter;
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

	@Override
	public String toString() {
		return "Character [idCharacter=" + idCharacter + ", nameCharacter=" + nameCharacter + ", universCharacter="
				+ universCharacter + ", healthCharacter=" + healthCharacter + ", attackCharacter=" + attackCharacter
				+ ", defenseCharacter=" + defenseCharacter + ", speedCharacter=" + speedCharacter
				+ ", staminaCharacter=" + staminaCharacter + ", intelligenceCharacter=" + intelligenceCharacter
				+ ", specialCharacter=" + specialCharacter + "]";
	}
	
	
	
	

}
