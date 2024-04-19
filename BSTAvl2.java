package application;

import java.util.Date;

public class BSTAvl2 extends BinaryBaseTree2 implements BSTIF2 {
	
	public NodeAvl2 findNode(Martyrs mart) {
		return findNode(mart, root);
	}

	public NodeAvl2 findNode(Martyrs mart, NodeAvl2 node) {
		if (node == null) {
			return null;
		}
		if(mart.getDateofdeath().compareTo(node.getD())==0) {
			return node;
		}
		else if (mart.getDateofdeath().compareTo(node.getD())>0) {
			 return findNode(mart, node.getRight());
		} else {
		return  findNode(mart, node.getLeft());
		}
		
	}

	public void insert(Martyrs mart) {
		root = insertNode(mart, root);
		
	}

	public NodeAvl2 insertNode(Martyrs mart, NodeAvl2 node) {

			if(node==null) {
				node=new NodeAvl2(mart.getDateofdeath());
				node.getStack().push(mart);
			}
			else if (mart.getDateofdeath().compareTo(node.getD())>0) {
						node.setRight(insertNode(mart, node.getRight()));
					} else {
						node.setLeft(insertNode(mart, node.getLeft()));
					}
			return node;
			}


		


@Override
	public void delete(NodeAvl2 d) {
		root = deleteNode(d, root);
	}

	public NodeAvl2 deleteNode( NodeAvl2 d, NodeAvl2 node) {
		if (node == null) {
			return node;
		} else if (d.getD().compareTo(node.getD())>0) {
			node.setRight(deleteNode(d, node.getRight()));
		} else if (d.getD().compareTo(node.getD())<0) {
			node.setLeft(deleteNode(d, node.getLeft()));
		} else if (node.getLeft() == null && node.getRight() == null) {
			node=null;
		} else if (node.getLeft() == null) {
			node = node.getRight();
		} else if (node.getRight() == null) {
			node = node.getLeft();
		} else {
			NodeAvl2 inOrderSuccessor = findMin(node.getRight());
			node.setD( inOrderSuccessor.getD());
			node.setStack(inOrderSuccessor.getStack());
			node.setRight(deleteNode(inOrderSuccessor,node.getRight()));
		}
		return node;
	}

	public NodeAvl2 findMin(NodeAvl2 node) {
		if (node == null) {
			return null;
		} else if (node.getLeft() == null) {
			return node;
		} else
			return findMin(node.getLeft());
	}

	
		
	}




//////////////////////////////////////////////////////////////////////////////////////
//public NodeAvl2 findNode(Martyrs mart, NodeAvl2 node) {
//	if (node == null) {
//		return null;
//	}
//	if(mart.compareTobydate(node)==0) {
//		return node;
//	}
//	if (mart.compareTobydate(node)>0) {
//		node = findNode(mart, node.getRight());
//	} else if (mart.compareTobydate(node)<0) {
//		node = findNode(mart, node.getLeft());
//	}
//	return node;
//}
//
//public void insert(Martyrs mart) {
//	root = insertNode(mart, root);
//}
//
//public NodeAvl2 insertNode(Martyrs mart, NodeAvl2 node) {
//	if (node == null) {
//		node = new NodeAvl2(mart.getDateofdeath());
//		node.getStack().push(mart);
//		}
//	NodeAvl2 x= findNode(mart);
//	if(x==null) {
//	 if (mart.compareTobydate(node)>0) {
//		node.setRight(insertNode(mart, node.getRight()));
//	} else {
//		node.setLeft(insertNode(mart, node.getLeft()));
//	}
//	}
//	else {
//		x.getStack().push(mart);
//	}
//	return node;
//}
/////////////////////////////////////////////////////////////////////////////////////

