package org.module.common.po;

import java.io.Serializable;

public class CostListPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8829619390677099808L;
	
	
	private String date;
	private String money;
	private String people;
	private String accout;
	private String entry;
	private String note;
	
	private State state;
	final private String split = ":%:%:";
	
	@Override
	public String toString(){
		return this.date + this.split +
				this.money + this.split + 
				this.people + this.split +
				this.accout + this.split +
				this.entry + this.split +
				this.note+ this.split + 
				this.state.toString() + this.split+
				this.ID;
	}
	
	public CostListPO(String string) {
		String[] s = string.split(split);
		this.date = s[0];
		this.money = s[1];
		this.people = s[2];
		this.accout = s[3];
		this.entry = s[4];
		this.note = s[5];
		this.state = State.getInstance(s[6]);
		this.ID = s[7];
	}
	public CostListPO(String date, String money, String people, String accout,
			String entry, String note,State state ,String id) {
		super();
		this.date = date;
		this.money = money;
		this.people = people;
		this.accout = accout;
		this.entry = entry;
		this.note = note;
		this.state = state;
		this.ID = id;
	}
	
	public State getState() {
		return state;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public String getAccout() {
		return accout;
	}
	public void setAccout(String accout) {
		this.accout = accout;
	}
	public String getEntry() {
		return entry;
	}
	public void setEntry(String entry) {
		this.entry = entry;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	private String ID;
	
	public String getID() {
		return ID;
	}

	
}
