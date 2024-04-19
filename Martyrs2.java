package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Martyrs2 {
	private String name;
	private int age;
	private Date dateofdeath;
	private String gender;
	private String sm;
private String locate;

	public Martyrs2() {
		// default constructor
	}


	public Martyrs2(String name,int age ,String locate,Date dateofdeath, String gender ,String sm){
			this.name=name;
			this.age=age;
			this.dateofdeath=dateofdeath;
			this.gender=gender;
			this.sm=sm;
			this.locate=locate;
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
		return  name + "," + age + ","+locate+"," +r.toString() + "," + gender
				+  "," + sm ;
	}





}

