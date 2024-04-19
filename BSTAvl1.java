package application;



public class BSTAvl1 extends BinaryBaseTree implements BSTIF {
	
	public NodeAvl1 findNode(Martyrs mart) {
		return findNode(mart, root);
	}

	public NodeAvl1 findNode(Martyrs mart, NodeAvl1 node) {
		if (node == null) {
			return null;
		}
		if(mart.compareTo(node.getMart())==0) {
			return node;
		}else if (mart.compareTo(node.getMart())>0) {
			return findNode(mart, node.getRight());
		} else  {
			return  findNode(mart, node.getLeft());
		}
		
	}

	public void insert(Martyrs mart) {
		root = insertNode(mart, root);
	}

	public NodeAvl1 insertNode(Martyrs mart, NodeAvl1 node) {
		if (node == null) {
			node = new NodeAvl1(mart);
		} else if (mart.compareTo(node.getMart())>0) {
			node.setRight(insertNode(mart, node.getRight()));
		} else {
			node.setLeft(insertNode(mart, node.getLeft()));
		}
		return node;
	}

	public void delete(Martyrs mart) {
		root = deleteNode(mart, root);
	}

	public NodeAvl1 deleteNode(Martyrs mart, NodeAvl1 node) {
		if (node == null) {
			return node;
		} else if (mart.compareTo(node.getMart())>0) {
			node.setRight(deleteNode(mart, node.getRight()));
		} else if (mart.compareTo(node.getMart())<0) {
			node.setLeft(deleteNode(mart, node.getLeft()));
		} else if (node.getLeft() == null && node.getRight() == null) {
			node=null;
		} else if (node.getLeft() == null) {
			node = node.getRight();
		} else if (node.getRight() == null) {
			node = node.getLeft();
		} else {
			node=deleteNodeWithTwoChildren(node);
		}
		
		return node;
	}

	NodeAvl1 deleteNodeWithTwoChildren(NodeAvl1 node) {
		NodeAvl1 inOrderSuccessor = findMin(node.getRight());
		node.setMart(inOrderSuccessor.getMart());
		node.setRight(deleteNode(inOrderSuccessor.getMart(),node.getRight()));
		return  node;
	}

	public NodeAvl1 findMin(NodeAvl1 node) {
		if (node == null) {
			return null;
		} else if (node.getLeft() == null) {
			return node;
		} else
			return findMin(node.getLeft());
	}

	
		
	}



