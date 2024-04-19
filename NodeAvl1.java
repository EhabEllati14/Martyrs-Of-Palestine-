package application;

public class NodeAvl1 {

	  private Martyrs mart;
	  private NodeAvl1 left,right;
	  private int height;
	
	  
	NodeAvl1(Martyrs mart ){
		this.mart=mart;
	}

	@Override
	public String toString() {
		return mart.toString();
	}

	
	public NodeAvl1 getLeft() {
		return left;
	}

	public NodeAvl1 getRight() {
		return right;
	}

	public int getHeight() {
		return height;
	}

	

	public Martyrs getMart() {
		return mart;
	}

	public void setMart(Martyrs mart) {
		this.mart = mart;
	}

	public void setLeft(NodeAvl1 left) {
		this.left = left;
	}

	public void setRight(NodeAvl1 right) {
		this.right = right;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	

}
