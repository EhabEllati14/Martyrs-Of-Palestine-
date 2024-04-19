package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Avl1tree extends BSTAvl1 {
public  int countav1=0;

//define a counter for how many nodes in the avl1 tree


public int RetCount() {
	return countav1;
}

	public void deleteinAvl(Martyrs m) {
		root=deleteNode(m,root);
	}
	//if we want to delete a selected martyrs we call delete method
	
	//this method when the user search about martyrs 
	public void Findbysearch(String name,NodeAvl1 node) {
		String d;
		if(node!=null) {
			if(node.getMart().getName().contains(name)) {
				d= new SimpleDateFormat("MM/dd/yyyy").format(node.getMart().getDateofdeath());
				Main.elements.add(new MartTable(node.getMart().getName(),node.getMart().getAge(),d,node.getMart().getGender(),node.getMart().getSm()));
			}
			Findbysearch(name, node.getLeft());
			Findbysearch( name, node.getRight());

	}
	}
	
@Override
//delete with given martyrs and with given root
	public NodeAvl1 deleteNode(Martyrs mart, NodeAvl1 node) {
		node= super.deleteNode(mart, node);
		// we call the delete method inside the binary search tree
		if (node == null) 
            return node;
            // if node equal null return node 
		// here we change the height because we always want the tree balanced
        node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
		countav1--;
		return reBalance(node);
		
	}

	
	// if the user want to insert a martyrs into the some location 
	public void InsertinAvl(Martyrs mart) {
		root = insertNode( mart, root);
	}
	
// call the method with given the root
	@Override
	public NodeAvl1 insertNode(Martyrs mart, NodeAvl1 node) {
		node=super.insertNode(mart, node);
		// call the insert method in the binary search
		if (node == null) 
            return node;
		
		// update the height of the tree because its balanced know
        node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
        countav1++;
		return reBalance(node);
	}
	
//	public int heightt(NodeAvl1 node) {
//		// this method to get the max height
//		if(node==null) {
//			return 0;
//			}
//			else {
//				  return Math.max(height(node.getLeft()), height(node.getRight())) + 1;
//			}
//		
//	}
	//public int height() {
		// we take the height to the root
	//	return heightt(root);
//	}
	private int height(NodeAvl1 node) {
		//this method  return the height for the specific given node
		if(node==null) {
			return -1;
		}
		else {
			return node.getHeight();
		}
		
	}
	public int balanceFactor(NodeAvl1 node) {
		// this method return the factor to the balance 
		// the calculate is the left height - the right height
		if(node==null) {
			return 0;
		}
		else {
		int bf=height(node.getLeft())-height(node.getRight());
		return bf;
		}
	}
	private NodeAvl1 reBalance (NodeAvl1 node) {
		// to make the tree balance we call this method
		if(node==null) {
			return node;
		}
		int bf=balanceFactor(node);
		// we call the rebalance to show the factor balance 
		if(bf>1) {
			//this is mean that the single rotate
			if(balanceFactor(node.getLeft())>=0) {
				return rightRotation(node);
			}
			else {
				//double rotate the problem in the right so rotate to the left then right
				node.setLeft(leftRotation(node.getLeft()));
				return rightRotation(node);
			}
		}
		if(bf<-1) {
			//this is mean that the single rotate
			if(balanceFactor(node.getRight())<=0) {
				node=leftRotation(node);
			}
			else {
				//double rotate the problem in the right so rotate to the right then left
				node.setRight(rightRotation(node.getRight()));
				return leftRotation(node);
			}
		}
		return node;
		
	}
	
	//double rotation in the right
	
	private NodeAvl1 rightRotation(NodeAvl1 node) {
		NodeAvl1 x=node.getLeft();
		NodeAvl1 y=x.getRight();
		x.setRight(node);
		node.setLeft(y);
		 node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
		 x.setHeight( Math.max(height(x.getLeft()), height(x.getRight())) + 1);
		return x;
	}
	
	
	//double rotate in the left
	
	private NodeAvl1 leftRotation(NodeAvl1 node) {
		NodeAvl1 x =node.getRight();
		NodeAvl1 y=x.getLeft();
		x.setLeft(node);
		node.setRight(y);
		 node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
		 x.setHeight( Math.max(height(x.getLeft()), height(x.getRight())) + 1);
		return x;
		
	}
	
	// this method to add elements in the table view
	public void printList(NodeAvl1 node){
		String d;
		if(node!=null) {
			d= new SimpleDateFormat("MM/dd/yyyy").format(node.getMart().getDateofdeath());
			printList(node.getLeft());
			Main.elements.add(new MartTable(node.getMart().getName(),node.getMart().getAge(),d,node.getMart().getGender(),node.getMart().getSm()));
			printList(node.getRight());	
		}
	
	
	}
	// to save in file we use this method
	public void printonfile(NodeAvl1 node, Node2 cur){
		if(node!=null) {
			printonfile(node.getLeft(),cur);
			String name=node.getMart().getName();
			int age=node.getMart().getAge();
			Date d = node.getMart().getDateofdeath();
			String gender = node.getMart().getGender();
			String status = node.getMart().getSm();
			Main.save.add(new Martyrs2(name,age,cur.getLocate(),d,gender,status));
			printonfile(node.getRight(),cur);	
		}
	}

	
}