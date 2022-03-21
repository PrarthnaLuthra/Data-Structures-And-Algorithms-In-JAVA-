package BinarySearchTrees;
import java.util.*;

public class PairSumBinaryTree {
    public static void convert(BinaryTreeNode<Integer> root,ArrayList<Integer>output){
        if(root==null){
            return;
        }
        output.add(root.data);
        convert(root.left,output);
        convert(root.right,output);
        
    }

	static void pairSum(BinaryTreeNode<Integer> root, int sum) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        ArrayList<Integer>output=new ArrayList<>();
        convert(root,output);
        Collections.sort(output);
        int i = 0;
        int j = output.size()-1;
        while(i<j){
            if(output.get(i)+output.get(j)== sum){
                int countI = 1, countJ=1;
                int k = i+1;
                while(output.get(k)==output.get(i)){
                    countI++;
                    k++;
                }
                k=j-1;
                while(output.get(k)==output.get(j)){
                    countJ++;
                    k--;
                }
                int count = countI*countJ;
                while(count>0){
                    System.out.println(output.get(i)+" " +output.get(j));
                    count--;
                }
                i+= countI;
                j-=countJ;
                
                    
                }
            else if(output.get(i)+output.get(j)>sum){
                j--;
            } else {
                i++;
            }
        }
	}
}
//             if(output.get(i)+output.get(j)<sum){
//                 j--;
//             }else if(output.get(i)+output.get(j)>sum){
//                 i++;
//             }else{
//                 System.out.println(output.get(i)+" "+ output.get(j));
//                 i++;
//                 j--;
//             }
//         }
        
//         return;
// 	}

// }
