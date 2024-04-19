package application;

import java.util.Date;

public class NodeAvl2 {
	private Date d;
	 private NodeAvl2 left,right;
	  private int height;
	  private Stack stack;
	  
	NodeAvl2(Date d ){
		this.d=d;
		stack = new Stack();
		
	}
	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public Stack getStack() {
		return stack;
	}

	public void setStack(Stack stack) {
		this.stack = stack;
	}
	public NodeAvl2 getLeft() {
		return left;
	}

	public NodeAvl2 getRight() {
		return right;
	}

	public int getHeight() {
		return height;
	}

	public void setLeft(NodeAvl2 left) {
		this.left = left;
	}

	public void setRight(NodeAvl2 right) {
		this.right = right;
	}

	public void setHeight(int height) {
		this.height = height;
	}
//	public int compareTobydate(NodeAvl2 o) {
//		Date d1= this.d;
//		Date d2=o.getD();
//		int result = d1.compareTo(d2); // we come it from the date;
//		if(result>0)
//			return 1;
//		else if(result<0)
//			return -1;
//		else
//			return 0;	
//		}
//	@Override
//	public int compareTo(NodeAvl2 o) {
//		return (int) (this.d.compareTo(o.d));
//		
//		// we use to compare between string 
//	}
//	
//	@Override
//	public int compareTo(NodeAvl2 o) {
//		Date d1= this.d;
//		Date d2=o.getD();
//		int result = d1.compareTo(d2); // we come it from the date;
//		if(result>0)
//			return 1;
//		else if(result<0)
//			return -1;
//		else
//			return 0;	
//		}
	}


