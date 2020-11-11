package com.po;


public class Bank{
  private Integer bid;
  private String uname;
  private Integer acount;
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
public Bank(Integer bid, String uname, Integer acount) {
	super();
	this.bid = bid;
	this.uname = uname;
	this.acount = acount;
}
public Integer getBid() {
	return bid;
}
public void setBid(Integer bid) {
	this.bid = bid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public Integer getAcount() {
	return acount;
}
public void setAcount(Integer acount) {
	this.acount = acount;
}
@Override
public String toString() {
	return "Bank [bid=" + bid + ", uname=" + uname + ", acount=" + acount + "]";
}
  
}
