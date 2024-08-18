package modelo;

import java.util.Date;

public class BattleResult {
	
	private int idBattleResult;
	private User user1;
	private User user2;
	private User winner;
	private Date battleDate;

	/**
	 * Empty Constructor
	 */
	public BattleResult() {
		
	}

	/**
	 * Full Constructor
	 * 
	 * @param idBattleResult
	 * @param user1
	 * @param user2
	 * @param winner
	 * @param battleDate
	 */
	public BattleResult(int idBattleResult, User user1, User user2, User winner, Date battleDate) {
		super();
		this.idBattleResult = idBattleResult;
		this.user1 = user1;
		this.user2 = user2;
		this.winner = winner;
		this.battleDate = battleDate;
	}

	public int getIdBattleResult() {
		return idBattleResult;
	}

	public void setIdBattleResult(int idBattleResult) {
		this.idBattleResult = idBattleResult;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public User getWinner() {
		return winner;
	}

	public void setWinner(User winner) {
		this.winner = winner;
	}

	public Date getBattleDate() {
		return battleDate;
	}

	public void setBattleDate(Date battleDate) {
		this.battleDate = battleDate;
	}

	@Override
	public String toString() {
		return "BattleResult [idBattleResult=" + idBattleResult + ", user1=" + user1 + ", user2=" + user2 + ", winner="
				+ winner + ", battleDate=" + battleDate + "]";
	}
		
	
}
