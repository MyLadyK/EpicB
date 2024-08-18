package modelo;

import java.security.Timestamp;
import java.util.List;

public class User {

	private int idUser;
	private String nameUser;
	private String mailUser;
	private String passwordHash;
	private int energy;
	private Timestamp lastEnergyRefill;
    private List <User> friends;
    private List <UserCharacter> characters;
    private List <Message> messageSent;
    private List <Message> messageReceived;
    private List <BattleResult> battleResult;

	
	/**
	 * Empty Constructor
	 */
	public User() {
		
	}
	
	/**
	 * Full Constructor
	 * 
	 * @param idUser
	 * @param nameUser
	 * @param mailUser
	 * @param passwordHash
	 * @param energy
	 * @param lastEnergyRefill
	 */
	
	public User(int idUser, String nameUser, String mailUser, String passwordHash, int energy,
			Timestamp lastEnergyRefill) {
		super();
		this.idUser = idUser;
		this.nameUser = nameUser;
		this.mailUser = mailUser;
		this.passwordHash = passwordHash;
		this.energy = energy;
		this.lastEnergyRefill = lastEnergyRefill;	// = new Timestamp(System.currentTimeMillis());
		//No lists
		
	}
	
	//G&S

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public Timestamp getLastEnergyRefill() {
		return lastEnergyRefill;
	}

	public void setLastEnergyRefill(Timestamp lastEnergyRefill) {
		this.lastEnergyRefill = lastEnergyRefill;
	}

	public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }
    
    public List<UserCharacter> getCharacters(){
    	return characters;
    }
    
    public void setCharacters(List<UserCharacter> characters) {
    	this.characters = characters;
    }
    
    public List <Message> getMessageSent(){
    	return messageSent;
    }
    
    public void setMessageSent(List<Message> messageSent) {
    	this.messageSent = messageSent;
    }
    
    public List <Message> getMessageReceived (){
    	return messageReceived;
    }
    
    public void setMessageReceived(List<Message> messageReceived) {
    	this.messageReceived = messageReceived;
    }
    
    public List <BattleResult> getBattleResult(){
    	return battleResult;
    }
    
    public void setBattleResult(List<BattleResult> battleResult) {
    	this.battleResult = battleResult;
    }

    //Methods
    
    
    
    
    @Override
	public String toString() {
		return "User [idUser=" + idUser + ", nameUser=" + nameUser + ", mailUser=" + mailUser + ", passwordHash="
				+ passwordHash + ", energy=" + energy + ", lastEnergyRefill=" + lastEnergyRefill + ", friends="
				+ friends + ", characters=" + characters + ", messageSent=" + messageSent + ", messageReceived="
				+ messageReceived + ", battleResult=" + battleResult + "]";
	}
	
		
	
}

