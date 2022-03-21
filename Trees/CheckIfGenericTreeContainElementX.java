package Trees;

public class CheckIfGenericTreeContainElementX {
    
    public static boolean ans = false;

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

        // Write your code here
        
        if(root==null){
            return false;
        }
        else if(root.data==x){
            return true;
           
        }

            for(int i = 0;i<root.children.size();i++){
                ans=checkIfContainsX(root.children.get(i),x);
            }
            
          return ans;
        }
        

    }


