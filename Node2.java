package application;

public class Node2 implements Comparable<Node2> {
	// creates nodes next prev
		// we make a string location 
		// node2 contains the locations and they point on the singlelinked lists
		private Node2 next;
		private Node2 previous;
		private String locate;
		private Avl1tree av1;
		private Avl2tree av2;
		// we create a object from singlelist
		//setters and getters of the parameters
	
		//this node is take a location and contains all martyrs in this location
		Node2(String locate){
			this.locate=locate;
			av1= new Avl1tree();
			av2= new Avl2tree();
		}
		public Avl1tree getAv1() {
			return av1;
		}
		public Avl2tree getAv2() {
			return av2;
		}
		public void setAv1(Avl1tree av1) {
			this.av1 = av1;
		}
		public void setAv2(Avl2tree av2) {
			this.av2 = av2;
		}
		public Node2 getNext() {
			return next;
		}
		public Node2 getPrevious() {
			return previous;
		}
		public String getLocate() {
			return locate;
		}
		public void setNext(Node2 next) {
			this.next = next;
		}
		public void setPrevious(Node2 previous) {
			this.previous = previous;
		}
		public void setLocate(String locate) {
			this.locate = locate;
		}
		
		@Override
		public int compareTo(Node2 o) {
			return this.locate.compareTo(o.locate);
			
			// we use to compare between string 
		}
		
		@Override
		public String toString() {
			return "[location=" + locate + "]";
		}

}
