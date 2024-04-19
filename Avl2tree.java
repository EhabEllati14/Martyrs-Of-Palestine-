package application;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Avl2tree extends BSTAvl2 {
public static int countav2=0;

public int RetCount() {
	return countav2;
}

	public void deleteinAv2(Martyrs m) {
		Stack d= new Stack();
		// first we create a stack temp when we delete or search we call it
		NodeAvl2 x=super.findNode(m);
		// we call the find Node to return the node
			while(x.getStack().first!= null){
				// here if the first in the stack is not Equals null
				if(x.getStack().first.getMart().getName().equals(m.getName()) && x.getStack().first.getMart().getDateofdeath().equals(m.getDateofdeath())&& x.getStack().first.getMart().getAge()==m.getAge() &&x.getStack().first.getMart().getGender().equals(m.getGender()) &&x.getStack().first.getMart().getSm().equals(m.getSm())) {
					x.getStack().pop();
					// if the node are equals the node that we wants delete it
					// if we found we go out break
					break;
				}
				else {
					//if we not found we pop from the stack orginal 
					// we push in the temp stack
					StackNode w=x.getStack().pop();
					d.push(w.getMart());
				}
			}
			
			while(d.first!=null) {
				 //after search about the martryrs in the orginal stack 
			    // we push all elements in the temp stack in the orginal stack
				x.getStack().push(d.first.getMart());
				d.pop();
			}
			if(x.getStack().isEmpty()==true) {
				root=deleteNode(x,root);
			}
		}
	
	


	public NodeAvl2 deleteNode(NodeAvl2 d, NodeAvl2 node) {
		// we call the delete method in the binary search 
		node= super.deleteNode(d, node);
		
		if (node == null) 
            return node;
            
		
		// here we update the height
        node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
		countav2--;
		return reBalance(node);
		
	}

	
	
	public void InsertinAvl2(Martyrs mart) {
		// findnode we want to search 
		NodeAvl2 h=super.findNode(mart);
		// if the findnode return h=null that is mean empty
		// we insert the date and we push in the stack
		if(h==null) {
			root = insertNode( mart, root);
		}
		else {
			// if the date of the  martyrs are found  so we add (push) the martyrs only
			h.getStack().push(mart);
		}
	}

	@Override
	public NodeAvl2 insertNode(Martyrs mart, NodeAvl2 node) {
		node=super.insertNode(mart, node);
		
		if (node == null) 
            return node;
		
        node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
        countav2++;
		return reBalance(node);
	}
	
	public int heightt(NodeAvl2 node) {
		if(node==null) {
			return 0;
			}
			else {
				  return Math.max(height(node.getLeft()), height(node.getRight())) + 1;
			}
		
	}
	public int height() {
		return heightt(root);
	}
	private int height(NodeAvl2 node) {
		if(node==null) {
			return -1;
		}
		else {
			return node.getHeight();
		}
		
	}
	public int balanceFactor(NodeAvl2 node) {
		if(node==null) {
			return 0;
		}
		else {
		int bf=height(node.getLeft())-height(node.getRight());
		return bf;
		}
	}
	private NodeAvl2 reBalance (NodeAvl2 node) {
		if(node==null) {
			return node;
		}
		int bf=balanceFactor(node);
		if(bf>1) {
			if(balanceFactor(node.getLeft())>=0) {
				return rightRotation(node);
			}
			else {
				node.setLeft(leftRotation(node.getLeft()));
				return rightRotation(node);
			}
		}
		if(bf<-1) {
			if(balanceFactor(node.getRight())<=0) {
				node=leftRotation(node);
			}
			else {
				node.setRight(rightRotation(node.getRight()));
				return leftRotation(node);
			}
		}
		return node;
		
	}
	
	
	
	private NodeAvl2 rightRotation(NodeAvl2 node) {
		NodeAvl2 x=node.getLeft();
		NodeAvl2 y=x.getRight();
		x.setRight(node);
		node.setLeft(y);
		 node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
		 x.setHeight( Math.max(height(x.getLeft()), height(x.getRight())) + 1);
		return x;
	}
	
	
	
	
	private NodeAvl2 leftRotation(NodeAvl2 node) {
		NodeAvl2 x =node.getRight();
		NodeAvl2 y=x.getLeft();
		x.setLeft(node);
		node.setRight(y);
		 node.setHeight( Math.max(height(node.getLeft()), height(node.getRight())) + 1);
		 x.setHeight( Math.max(height(x.getLeft()), height(x.getRight())) + 1);
		return x;
		
	}
	
	public void printList(NodeAvl2 node){
		if(node!=null) {
			printList(node.getRight());	
			node.getStack().Printstack();
			printList(node.getLeft());
		}
	
	
	}
	
	public NodeAvl2 datemax(NodeAvl2 node) {
		// if the node is null so return null
        if (node == null)
            return null;

        // we define max node that takes the node that was given in the method
        NodeAvl2 max = node;
        //we define int max we take the count of the node  
        int maxsize = node.getStack().countstack();

        // first we call the left 
        NodeAvl2 left = datemax(node.getLeft());
        // we compare between the node and the left
        if (left != null && left.getStack().countstack() > maxsize) {
            max = left;
            maxsize = left.getStack().countstack();
        }
        // first we call the right 
        NodeAvl2 right = datemax(node.getRight());
     // we compare between the node and the right
        if (right != null && right.getStack().countstack() > maxsize) {
            max = right;
        }

        return max;
    }
}
	
	


	

