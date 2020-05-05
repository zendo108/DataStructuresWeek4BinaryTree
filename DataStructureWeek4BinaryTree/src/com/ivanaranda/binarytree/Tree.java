package com.ivanaranda.binarytree;

public class Tree {
	private Node root;
	
	public Node find(int id) {
		Node curr = root;
		int i = 0;//iterations
		while(curr.id != id) {
			i++;
			if(id < curr.id) {
				curr = curr.leftChild;
			}else {
				curr = curr.rightChild;
			}
			if(curr == null) {
				iterations(i);
				return null;
			}
		}
		iterations(i);
		return curr;
	}
	
	public void insert(int id) {
			Node n = new Node();
			n.id = id;
			if(root==null) {//if root is null, meaning the tree is empty
				root = n;//assign this first value if id to root and return
			}else {//else if root is already taken go fish
				Node curr = root;//assign current node to root at the start
				Node parent;//create a parent node that is null
				while(true) {
					parent = curr;//make current node parent
					
					if(id < curr.id) {//if the id value is less than the current node id value go left 
						curr = curr.leftChild;//and make current node the left child
						if(curr == null) {//if the child node turned out to be null
							parent.leftChild = n;//assign the value to the null child
							return;//done and return
						}
					}else//if the id value is greater than the current node id value go right
					{
						curr = curr.rightChild;//and make current node the right child
						if(curr == null) {//if the child node turned out to be null
							parent.rightChild = n;//assign the value to the null child
							return;//done and return
						}
					}//END else
						
				}//END while
			}//END else not root
		}//end function insert
	
	public void delete(int id) {
		
	}
	
	public void inOrder(Node n) {
		
		if(n != null) {
			inOrder(n.leftChild);
			System.out.println("Node id: "+n.id);
			inOrder(n.rightChild);
		}
	}
	
	public Node getRoot() {
		return root;
	}
	
	public void showTree(Node n) {
		if(n != null) {
			
			showTree(n.leftChild);
			showTree(n.rightChild);
			System.out.println("node id: "+n.id);
		}
	}
	
	private void iterations(int i) {
		
		
		System.out.println("This search took " + i + " iterations");
	}
	
}
