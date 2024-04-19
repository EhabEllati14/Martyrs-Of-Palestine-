package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class MartTable {
	private SimpleStringProperty name ;
	private SimpleIntegerProperty age;
	private SimpleStringProperty date;
	private SimpleStringProperty gender;
	private SimpleStringProperty status;
	
	public MartTable(String s1,int s2, String s3, String s4, String s5) {
		
		name=new SimpleStringProperty(s1);
		age= new SimpleIntegerProperty(s2);
		date=new SimpleStringProperty(s3);
		gender=new SimpleStringProperty(s4);
		status=new SimpleStringProperty(s5);
	}
	public void setAge(int r) {
		age.set(r);
	}


	public void setName(String r) {
		name.set(r);
	}
	public void setDate(String r) {
		date.set(r);
	}
	public void setgender(String r) {
		gender.set(r);
	}
	public void setStatus(String r) {
		status.set(r);
	}
	public int getAge() {
		return age.get();
	}

	public String getName() {
		return name.get();
	}
	
	public String getDate() {
		return date.get();
	}
	public String getGender() {
		return gender.get();
	}
	public String getStatus() {
		return status.get();
	}


}
