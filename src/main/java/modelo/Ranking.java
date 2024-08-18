package modelo;

public class Ranking {

	public int idRanking;
	private User user;
	private int userPoints;
	
	/**
	 * Empty Constructor
	 */
	public Ranking() {
		
	}

	/**
	 * Full Constructor
	 * 
	 * @param idRanking
	 * @param user
	 * @param userPoints
	 */
	public Ranking(int idRanking, User user, int userPoints) {
		super();
		this.idRanking = idRanking;
		this.user = user;
		this.userPoints = userPoints;
	}

	public int getIdRanking() {
		return idRanking;
	}

	public void setIdRanking(int idRanking) {
		this.idRanking = idRanking;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getUserPoints() {
		return userPoints;
	}

	public void setUserPoints(int userPoints) {
		this.userPoints = userPoints;
	}
	

	@Override
	public String toString() {
		return "Ranking [idRanking=" + idRanking + ", user=" + user + ", userPoints=" + userPoints + "]";
	}
	
}
