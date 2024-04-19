package application;

import java.text.SimpleDateFormat;
//circular double linked list 
public class DoubleList {
	//create the nodes
		Node2 firstd=null;
		Node2 last=null;
		int countd = 0;
		//if we return the first node in the double list
		public Node2 getFirst() {
			if (countd == 0)
				return null;
			else
				return firstd;
		}
	    // return the last node in the list
		public Node2 getLast() {
			if (countd == 0)
				return null;
			else
				return last;
		}
	 // we want to add from first
		public void addFirst(String L ,Martyrs m) {
			Node2 newn = new Node2(L);
			newn.getAv1().InsertinAvl(m);
			newn.getAv2().InsertinAvl2(m);
			if (countd == 0) {
				firstd = last = newn;
				newn.setNext(firstd);
				newn.setPrevious(firstd);
			
			} else {
				newn.setNext(firstd);
				newn.setPrevious(last);
				firstd.setPrevious(newn);
				last.setNext(newn);
				firstd = newn;
			}
			countd++;
		}
		// add first but add a locate only
		public void addFirstL(String L) {
			Node2 newn = new Node2(L);
			if (countd == 0) {
				firstd = last = newn;
				newn.setNext(firstd);
				newn.setPrevious(firstd);
			
			} else {
				newn.setNext(firstd);
				newn.setPrevious(last);
				firstd.setPrevious(newn);
				last.setNext(newn);
				firstd = newn;
			}
			countd++;
		}
		
		
	// add locate from the last of the list
		public void addLast(String L, Martyrs m) {
			Node2 newn = new Node2(L);
			newn.getAv1().InsertinAvl(m);
			newn.getAv2().InsertinAvl2(m);
			if (countd == 0) {
				firstd = last = newn;
			} else {
				newn.setNext(firstd);
				newn.setPrevious(last);
				last.setNext(newn);
				firstd.setPrevious(newn);
				last = newn;
			}
			countd++;
		}
		
		
		public void addLastL(String L) {
			Node2 newn = new Node2(L);
			
			if (countd == 0) {
				firstd = last = newn;
			} else {
				newn.setNext(firstd);
				newn.setPrevious(last);
				last.setNext(newn);
				firstd.setPrevious(newn);
				last = newn;
			}
			countd++;
		}
		
		
		// here  if we want to add a locate but we add with it the martyr
		
		public void add(String locate, Martyrs m ,int index) {
			Node2 newn = new Node2(locate);
			newn.getAv1().InsertinAvl(m);
			newn.getAv2().InsertinAvl2(m);
			if (index == 0) {
				addFirst(locate,m);
			} else if (index >=countd) {
				addLast(locate,m);
				}
			else {
				Node2 current = firstd;
				for (int i = 0; i < index - 1; i++) {    //o(n) --> because we go to the index 
					current = current.getNext();
				}
				newn.setNext(current.getNext());
				newn.setPrevious(current);
				current.setNext(newn);
				(current.getNext()).getNext().setPrevious(newn);
				countd++;
			}
		}
		// add location at some index
		public void add(String locate,int index) {
			Node2 newn = new Node2(locate);
			if (index == 0) {
				addFirstL(locate);
			} else if (index >=countd) {
				addLastL(locate);
				}
			else {
				Node2 current = firstd;
				for (int i = 0; i < index - 1; i++) { //o(n) --> we stop to the n index
					current = current.getNext();
				}
				newn.setNext(current.getNext());
				newn.setPrevious(current);
				current.setNext(newn);
				(current.getNext()).getNext().setPrevious(newn);
				countd++;
			}
		}	
		
		
		// this method to add locate and martyrs to the list 
		// in this method we sort and remove the deplicated names from location 

		public void add(String Locate,Martyrs m) {
			Node2 cur = firstd;
			Node2 f =null;
			int index=0;
			// we create 2 variables 
			//index--> for the add to add in this index by sorting
			// we use a flag to know if the location is in the list or not
			int flag=0;
			for(int i=0;i<countd;i++) {
				if(Locate.compareTo(cur.getLocate())>0) {// use the compare to method
					cur=cur.getNext();
					++index;
				}
				else if(Locate.compareTo(cur.getLocate())==0) {
					flag=1;
					 f =cur;
					break;
						}
			
				else {
					cur=cur.getNext();
				}
			}
			if(flag==0) {
			add(Locate,m,index);
			//l.getTabel().setItems((ObservableList) m);
		
			}
			else {
				f.getAv1().InsertinAvl(m);
				f.getAv2().InsertinAvl2(m);
			}
			}
		
		// add location only
		
		public void add(String Locate) {
			Node2 cur = firstd;
			int index=0;
			int flag=0;
			for(int i=0;i<countd;i++) {
				if(Locate.compareTo(cur.getLocate())>0) {
					cur=cur.getNext();
					++index;
				}
				else if(Locate.compareTo(cur.getLocate())==0) {
					flag=1;
	               
					break;
						}
				else {
					cur=cur.getNext();
				}
			}
			if(flag==0) {
			add(Locate,index);
			}
			
			}

		
		// update at this node we give it the location 
		
		public void Update(String Locate ,Node2 n) {
			// we store n in node b
			Node2 b=n;
			Avl1tree r= b.getAv1();
			NodeAvl1 m=r.getRoot();
			remove(n.getLocate());
			addavl1(m,Locate);	
			
			}
			
		public void addavl1(NodeAvl1 node,String Locate) {
			if(node!=null) {
				addavl1(node.getLeft(),Locate);
					add(Locate,node.getMart());
					addavl1(node.getRight(),Locate);	
			}
		}
		
		
		
		
		
		public void Search(String name,Node2 n) {
			NodeAvl1 b=n.getAv1().getRoot();
			n.getAv1().Findbysearch(name, b);
			}
		
		
		// search about string of the martyrs in thi node
//			public String Search(String name,Node2 n) throws NullPointerException {
//				//singleLL list = new singleLL();
//				Node1 b =n.getSinglelist().getFirst();
//				String r="";
//				for(int i=0;i< n.getSinglelist().count;i++) {
//					if(b.getMartyrs().getName().contains(name)) {
//						r=r+"\n"+b.getMartyrs().getName();
//					b=b.getNext();
//					}
//					else {
//						b=b.getNext();
//					}
//				}
//				return r;
//				
//				
//			}
		
		
		
	// this only search by name to return the menu of the names
//			public Node1 Searchmartry(String name,Node2 n) throws NullPointerException {
//				Node1 b =n.getSinglelist().getFirst();
//				Node1 r=null;
//				for(int i=0;i< n.getSinglelist().count;i++) {//o(n)
//					if(b.getMartyrs().getName().contains(name)) {
//						r=b;
//						break;
//					}
//					else {
//						b=b.getNext();
//					}
//				}
//				return r;
//				
//			}
			
			
		
	// when we want to remove from first
			// we have many cases we must check it

		public void removeFirst() {
			if (countd == 0) {
				System.out.println("The list is Empty!!");

			} else if (countd == 1) {
				firstd = last = null;
			} else {
				Node2 current = firstd;
				firstd = firstd.getNext();
				firstd.setPrevious(last);
				last.setNext(firstd);
				current.setNext(null);
				current.setPrevious(null);

			}
			countd--;
		}

		public void removeLast() {
			if (countd == 0) {
				System.out.println("The list is Empty!!");

			} else if (countd == 1) {
				firstd = last = null;
			} else {
				Node2 current = firstd;
				for (int i = 0; i < countd - 2; i++) {
					current = current.getNext();
				}
				current.setNext(firstd);
				firstd.setPrevious(current);
				last=current;
				
			}
			countd--;
		}

		public void remove(int index) {
			if (index == 0) {
				removeFirst();
			} else if (index == countd - 1) {
				removeLast();
			} else if (index < 0 || index >= countd) {
				throw new IllegalArgumentException("Error : you enter out index number !!");
			} else {
				Node2 current = firstd;
				for (int i = 0; i < index - 1; i++) {
					current = current.getNext();
				}
				Node2 temp = current.getNext();
				current.getNext().setPrevious(null);
				current.setNext(current.getNext().getNext());
				current.getNext().setPrevious(current);
				temp.setNext(null);
				countd--;
			}
		}
	// if we want to remove some locate
		public void remove(String Locate) {
			try {
			Node2 current=null;
			if (countd != 0) {
				if (Locate.equals(firstd.getLocate())) {
					removeFirst();
				} else if (Locate.equals(last.getLocate())) {
					removeLast();
				} else {
				 current = firstd;
					for (int i = 0; i < countd-1; i++) {
						if (Locate.equals(current.getLocate())) {
							remove(i);
						}
						
						current = current.getNext();
					}
					
				}
			}
			}
			catch(NullPointerException ex) {
				System.out.print("");
			}
		}
	//we use it to printr in the textarea
		public void PrintDoubleList() {
			Node2 current = firstd;

			for (int i = 0; i <countd; i++) {
				System.out.print(current.getLocate()+"   ");
		//	System.out.println(current.getSinglelist().printList());
				current = current.getNext();

			
		}
		}
	
}
