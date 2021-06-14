
public class Runner {
	public static void main(String[] args) {
		Node root=new Node(10);
    	root.left=new Node(5);
    	root.right=new Node(15);
    	root.right.left=new Node(12);
    	root.right.right=new Node(18);
    	int x;
    	int z;
    	
    	BinarySearchTree b1=new BinarySearchTree();
    	root=b1.insert(root,100);
    	root=b1.insert(root,200);
    	root=b1.insert(root,300);
    	root=b1.insert(root,400);
    	root=b1.insert(root,500);
    	root=b1.insert(root,600);
    	root=b1.insert(root,700);
    	root=b1.insert(root,800);
    	System.out.println("Insert the element in BST: ");
	    b1.inorder(root);
	   
	    
	    System.out.println();
	    
		root=b1.delNode(root,500);
	    root=b1.delNode(root,600);
	    root=b1.delNode(root,15);
	    System.out.println("Delete the element in BST: ");
	    b1.inorder(root);
	}


}
