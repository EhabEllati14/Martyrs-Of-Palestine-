package application;

public class BinaryBaseTree2 implements BinaryTree2 {
	 NodeAvl2 root;

	public NodeAvl2 getRoot() {
		return root;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		appendStringToTree(builder, root);
		return builder.toString();
	}

	void appendStringToTree(StringBuilder builder, NodeAvl2 node) {
		if (node.getLeft() != null) {
			appendStringToTree(builder, node.getLeft());
		}
		appendNode(builder, node);
		if (node.getRight() != null) {
			appendStringToTree(builder, node.getRight());
		}
	}

	void appendNode(StringBuilder builder, NodeAvl2 node) {
		builder.append(node.getD());
	}

}