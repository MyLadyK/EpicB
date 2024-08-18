package modelo;

import java.security.Timestamp;

public class Friendship {
	
	private User user1;
    private User user2;
    private Timestamp friendshipDate;
    
    /**
     * Empty Constructor
     */
    public Friendship() {
    }
    
    /**
     * Full Constructor
     * 
     * @param user1
     * @param user2
     * @param friendshipDate
     */
	public Friendship(User user1, User user2, Timestamp friendshipDate) {
		super();
		this.user1 = user1;
		this.user2 = user2;
		this.friendshipDate = friendshipDate;
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

	public Timestamp getFriendshipDate() {
		return friendshipDate;
	}

	public void setFriendshipDate(Timestamp friendshipDate) {
		this.friendshipDate = friendshipDate;
	}

	@Override
	public String toString() {
		return "Friendship [user1=" + user1 + ", user2=" + user2 + ", friendshipDate=" + friendshipDate + "]";
	}
    
    

}
