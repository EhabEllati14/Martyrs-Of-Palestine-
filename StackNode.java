package application;

public class StackNode {
 private Martyrs mart;
 private StackNode next;

 public Martyrs getMart() {
	return mart;
}

public StackNode getNext() {
	return next;
}

public void setMart(Martyrs mart) {
	this.mart = mart;
}

public void setNext(StackNode next) {
	this.next = next;
}

StackNode(Martyrs mart){
	 this.mart=mart; 
 }


}
