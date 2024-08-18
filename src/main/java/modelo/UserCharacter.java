package modelo;

public class UserCharacter {
	
	private int idUserCharacter;
	private User owner;
    private Characters baseCharacter;
	private double healthCharacterMod;
	private double attackCharacterMod;
	private double defenseCharacterMod;
	private double speedCharacterMod;
	private double staminaCharacterMod;
	private double intelligenceCharacterMod;
	private double specialCharacterMod;
	private int timesUsed;
	
	/**
	 * Empty Constructor
	 */
	public UserCharacter() {
		
	}
	
	/**
	 * Full Constructor
	 * 
	 * @param idUserCharacter
	 * @param owner
	 * @param baseCharacter
	 * @param healthCharacterMod
	 * @param attackCharacterMod
	 * @param defenseCharacterMod
	 * @param speedCharacterMod
	 * @param staminaCharacterMod
	 * @param intelligenceCharacterMod
	 * @param specialCharacterMod
	 */
	public UserCharacter(int idUserCharacter, User owner, Characters baseCharacter, double healthCharacterMod,
			double attackCharacterMod, double defenseCharacterMod, double speedCharacterMod, double staminaCharacterMod,
			double intelligenceCharacterMod, double specialCharacterMod, int timesUsed) {
		super();
		this.idUserCharacter = idUserCharacter;
		this.owner = owner;
		this.baseCharacter = baseCharacter;
		this.healthCharacterMod = healthCharacterMod;
		this.attackCharacterMod = attackCharacterMod;
		this.defenseCharacterMod = defenseCharacterMod;
		this.speedCharacterMod = speedCharacterMod;
		this.staminaCharacterMod = staminaCharacterMod;
		this.intelligenceCharacterMod = intelligenceCharacterMod;
		this.specialCharacterMod = specialCharacterMod;
		this.timesUsed = timesUsed;
	}

	
	public int getIdUserCharacter() {
		return idUserCharacter;
	}

	public void setIdUserCharacter(int idUserCharacter) {
		this.idUserCharacter = idUserCharacter;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Characters getBaseCharacter() {
		return baseCharacter;
	}

	public void setBaseCharacter(Characters baseCharacter) {
		this.baseCharacter = baseCharacter;
	}

	public double getHealthCharacterMod() {
		return healthCharacterMod;
	}

	public void setHealthCharacterMod(double healthCharacterMod) {
		this.healthCharacterMod = healthCharacterMod;
	}

	public double getAttackCharacterMod() {
		return attackCharacterMod;
	}

	public void setAttackCharacterMod(double attackCharacterMod) {
		this.attackCharacterMod = attackCharacterMod;
	}

	public double getDefenseCharacterMod() {
		return defenseCharacterMod;
	}

	public void setDefenseCharacterMod(double defenseCharacterMod) {
		this.defenseCharacterMod = defenseCharacterMod;
	}

	public double getSpeedCharacterMod() {
		return speedCharacterMod;
	}

	public void setSpeedCharacterMod(double speedCharacterMod) {
		this.speedCharacterMod = speedCharacterMod;
	}

	public double getStaminaCharacterMod() {
		return staminaCharacterMod;
	}

	public void setStaminaCharacterMod(double staminaCharacterMod) {
		this.staminaCharacterMod = staminaCharacterMod;
	}

	public double getIntelligenceCharacterMod() {
		return intelligenceCharacterMod;
	}

	public void setIntelligenceCharacterMod(double intelligenceCharacterMod) {
		this.intelligenceCharacterMod = intelligenceCharacterMod;
	}

	public double getSpecialCharacterMod() {
		return specialCharacterMod;
	}

	public void setSpecialCharacterMod(double specialCharacterMod) {
		this.specialCharacterMod = specialCharacterMod;
	}
	
	public int getTimesUsed() {
		return timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}

	@Override
	public String toString() {
		return "UserCharacter [idUserCharacter=" + idUserCharacter + ", owner=" + owner + ", baseCharacter="
				+ baseCharacter + ", healthCharacterMod=" + healthCharacterMod + ", attackCharacterMod="
				+ attackCharacterMod + ", defenseCharacterMod=" + defenseCharacterMod + ", speedCharacterMod="
				+ speedCharacterMod + ", staminaCharacterMod=" + staminaCharacterMod + ", intelligenceCharacterMod="
				+ intelligenceCharacterMod + ", specialCharacterMod=" + specialCharacterMod + ", timesUsed=" + timesUsed
				+ "]";
	}

	

}
