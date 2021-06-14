
public class BinarySearchTree {
	 public static Node insert(Node root, int x)
	 {
	        if(root==null)
	            return new Node(x);
	        else if(root.key<x)
	            root.right=insert(root.right,x);
	        else if(root.key>x)
	            root.left=insert(root.left,x);
	        return root;
	    }
	 public static Node delNode(Node root, int z)
	 {
	        if(root==null)
	            return root;
	        if(root.key>z)
	            root.left=delNode(root.left,z);
	        else if(root.key<z)
	            root.right=delNode(root.right,z);
	        else{
	            if(root.left==null){
	                return root.right;
	            }
	            else if(root.right==null){
	                return root.left;
	            }
	            else{
	                Node succ=getSuccessor(root);
	                root.key=succ.key;
	                root.right=delNode(root.right,succ.key);
	            }
	        }
	        return root;
	    } 
	 
	 public static Node getSuccessor(Node curr)
	 {
	        curr=curr.right;
	        while(curr!=null && curr.left!=null)
	            curr=curr.left;
	        return curr;
	    }
	    
	    public static void inorder(Node root)
	    {
	        if(root!=null){
	            inorder(root.left);
	            System.out.print(root.key+" ");
	            inorder(root.right);
	        }    
	    }

}
