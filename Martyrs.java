package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Martyrs implements Comparable<Martyrs> {
	
	private String name;
	private int age;
	private Date dateofdeath;
	private String gender;
	private String sm;


	public Martyrs() {
		// default constructor
	}


	public Martyrs(String name,int age ,Date dateofdeath, String gender ,String sm){
			this.name=name;
			this.age=age;
			this.dateofdeath=dateofdeath;
			this.gender=gender;
			this.sm=sm;
		}



	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Date getDateofdeath() {
		return dateofdeath;
	}
	public String getGender() {
		return gender;
	}

	public String getSm() {
		return sm;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setDateofdeath(Date dateofdeath) {
		this.dateofdeath = dateofdeath;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSm(String sm) {
		this.sm = sm;
	}
	@Override
	public String toString() {
		String r=new SimpleDateFormat("MM/dd/yyyy").format(dateofdeath);
		return  name + "," + age + ","+Main.cur.getLocate()+"," +r.toString() + "," + gender
				+  "," + sm ;
	}


	@Override
	public int compareTo(Martyrs o) {
		return  this.name.compareTo(o.getName());
	}
	



}
