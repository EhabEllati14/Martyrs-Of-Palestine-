package application;

import java.text.SimpleDateFormat;

public class Stack {
	StackNode first;
	
	
	
	public int countstack() {
		StackNode r =first;
		int count=0;
		while (r != null) {
			count++;
			r = r.getNext();
		}
		return count;
	}
	
	public void push(Martyrs mart) {
		StackNode newr= new StackNode(mart);
		if(first==null) {
			first=newr;
		}
		else {
			newr.setNext(first);
			first=newr;
		}
	}
	public StackNode pop() {
		StackNode temp=first;
		if(first==null) {
			System.out.println("The Stack is empty!!");
			return null;
		}
		else {
			first=first.getNext();
			temp.setNext(null);
		}
		return temp;
		
	}
	
	public boolean isEmpty() {
		if(first==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public void Printstack() {
		StackNode r =first;
		String d;
		while (r != null) {
			d=new SimpleDateFormat("MM/dd/yyyy").format(r.getMart().getDateofdeath());
			Main.elements2.add(new MartTable(r.getMart().getName(),r.getMart().getAge(),d,r.getMart().getGender(),r.getMart().getSm()));
			r = r.getNext();
		}
	}

}
