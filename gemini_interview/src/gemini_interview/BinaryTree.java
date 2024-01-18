package gemini_interview;

public class BinaryTree {
	private TreeNode root;
	private class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
	public void createTree()
	{
		TreeNode f=new TreeNode(1);
		TreeNode se=new TreeNode(2);
		TreeNode th=new TreeNode(3);
		TreeNode fo=new TreeNode(4);
		TreeNode fi=new TreeNode(5);
		TreeNode s=new TreeNode(6);
		TreeNode sev=new TreeNode(7);
	     root=f;
	     f.left=se;
	     f.right=th;
	     se.left=fo;
	     se.right=fi;
	     th.left=s;
	     th.right=sev;

	}
    public void preorder(TreeNode root)
    {
    	if(root==null)
    		  return;
    	System.out.print(root.data+" ");
    	preorder(root.left);
    	preorder(root.right);
    	
    }
    public void inorder(TreeNode root)
    {
    	if(root==null)
    		return;
    	inorder(root.left);
    	System.out.print(root.data+" ");
    	inorder(root.right);
    }
    public void postorder(TreeNode root)
    {
    	if(root==null)
    		return;
    	postorder(root.left);
       	postorder(root.right);
       	System.out.print(root.data+" ");

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree bt=new BinaryTree();
        bt.createTree();
        bt.preorder(bt.root);
        System.out.println(); 
        bt.inorder(bt.root);
        System.out.println(); 
        bt.postorder(bt.root);
        
	}

}
