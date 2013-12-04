package hr.mobster.core;

public class Player {
	
 private String name;
 private String rank;
 private double money;
 
 public Player(){
	
 }

 
 public Player(String name, String rank,double money) {
	super();
	this.name = name;
 }

public double getMoney() {
	return money;
}


public void setMoney(double money) {
	this.money = money;
}


public String getRank() {
	return rank;
}

public void setRank(String rank) {
	this.rank = rank;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
} 
