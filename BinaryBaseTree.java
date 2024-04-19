package application;

public class BinaryBaseTree implements BinaryTree {
	NodeAvl1 root;

	public NodeAvl1 getRoot() {
		return root;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		appendStringToTree(builder, root);
		return builder.toString();
	}

	void appendStringToTree(StringBuilder builder, NodeAvl1 node) {
		if (node.getLeft() != null) {
			appendStringToTree(builder, node.getLeft());
		}
		appendNode(builder, node);
		if (node.getRight() != null) {
			appendStringToTree(builder, node.getRight());
		}
	}

	void appendNode(StringBuilder builder, NodeAvl1 node) {
		builder.append(node.getMart().toString());
	}

}