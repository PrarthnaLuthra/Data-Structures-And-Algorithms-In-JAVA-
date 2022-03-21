package Trees;

public class NextLargerElement {
    public static TreeNode<Integer>ans=null;
    public static TreeNode<Integer>temp=null;
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

		// Write your code here
        if(root==null){
            return root;
        }
       if (ans == null) {
			if (root.data > n) {
				ans = root;
			}
		} else {
			if (root.data < ans.data && root.data > n) {
				ans = root;
			}
		}
        for(int i = 0;i<root.children.size();i++){
            try{
            temp =findNextLargerNode(root.children.get(i),  n);
            if (temp.data > n) {
					if (ans==null||temp.data < ans.data) {
						ans = temp;
					}
				}
        }catch (Exception e) {
				e.printStackTrace();
			}
        

	}
        return ans;
    }

}

