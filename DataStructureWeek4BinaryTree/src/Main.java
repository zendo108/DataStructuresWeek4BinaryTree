import com.ivanaranda.binarytree.Node;
import com.ivanaranda.binarytree.Tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree tree = new Tree();
		tree.insert(8);
		tree.insert(111);
		tree.insert(113);
		tree.insert(121);
		
		tree.insert(3);
		tree.insert(11);
		tree.insert(1);
		tree.insert(13);
		
		System.out.println("this is the root " + tree.getRoot().getID());
		System.out.println("Tree nodes ascending order");
		tree.inOrder(tree.getRoot());
		System.out.println("\n");
		System.out.println("Tree from leaf nodes up");
		tree.showTree(tree.getRoot());
		
		System.out.println("\n");
		System.out.println("Finding node");
		Node found = tree.find(1);
		if(found != null) {
			System.out.println("Found node ");
		}else {
			System.out.println("Node not found");
		}
	}

}
