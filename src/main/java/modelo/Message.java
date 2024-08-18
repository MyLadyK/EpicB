package modelo;

import java.util.Date;

public class Message {

	private int idMessage;
    private User sender;
    private User addressee;
    private String content;
    private Date sendingDate;
    
    /**
     * Empty Constructor
     */
    public Message() {
    	
    }

    /**
     * Full Constructor
     * 
     * @param idMessage
     * @param sender
     * @param addressee
     * @param content
     * @param sendingDate
     */
	public Message(int idMessage, User sender, User addressee, String content, Date sendingDate) {
		super();
		this.idMessage = idMessage;
		this.sender = sender;
		this.addressee = addressee;
		this.content = content;
		this.sendingDate = sendingDate;
	}

	
	public int getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getAddressee() {
		return addressee;
	}

	public void setAddressee(User addressee) {
		this.addressee = addressee;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSendingDate() {
		return sendingDate;
	}

	public void setSendingDate(Date sendingDate) {
		this.sendingDate = sendingDate;
	}

	
	@Override
	public String toString() {
		return "Message [idMessage=" + idMessage + ", sender=" + sender + ", addressee=" + addressee + ", content="
				+ content + ", sendingDate=" + sendingDate + "]";
	}
    
    
}
