package modelo;

import java.security.Timestamp;

public class Admin extends User{

	/**
	 * Empty Constructor
	 */
	
	public Admin() {
		super();
	}

	/**
	 * Full Constructor that extends from User Constructor
	 * 
	 * @param idUser
	 * @param nameUser
	 * @param mailUser
	 * @param passwordHash
	 * @param energy
	 * @param lastEnergyRefill
	 */
	
	public Admin(int idUser, String nameUser, String mailUser, String passwordHash, int energy,
			Timestamp lastEnergyRefill) {
		super(idUser, nameUser, mailUser, passwordHash, energy, lastEnergyRefill);
	}

	
	/**
	 * Method to bann users for five days
	 * 
	 * @param usuario
	 * @param dias
	 */
    public void bannUser(User usuario, int days) {
        
    }
    
    /**
     * Method to permanently eliminate users 
     * @param usuario
     */
	public void eliminateUser(User usuario) {
        
    }
	
	
}
	
    
