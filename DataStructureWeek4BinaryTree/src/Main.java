import com.ivanaranda.binarytree.Node;
import com.ivanaranda.binarytree.Tree;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Tree tree = new Tree();

		System.out.println("First prompt,Enter negative integer to quit eg -1");
		//dot. (2020). try{}  and  catch{}. Retrieved May 5, 2020, from Ccsu.edu website: https://chortle.ccsu.edu/java5/Notes/chap80/ch80_5.html
		int num;
		try {
			num = input.nextInt();
			while(num>-1) {
				System.out.println("Enter integer(-1 to quit)");
				
				tree.insert(num);
				num = input.nextInt();
				
			}
			System.out.println("It appears as you've have exited the program");
			System.out.println("Run the program again." );
			System.out.println("If you feels that there's an error, please let us know, Thx!!" );
		}catch(InputMismatchException ex) {
			System.out.println("You entered bad data." );
		      System.out.println("Run the program again." );
		}finally {
			input.close();
		}
		
		if(tree.getRoot()!=null) {
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

}
