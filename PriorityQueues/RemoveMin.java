package PriorityQueues;
import java.util.ArrayList;

public class RemoveMin {private ArrayList<Integer> heap = new ArrayList<Integer>();
	boolean isEmpty() {
		// Implement the isEmpty() function here
        return heap.isEmpty();
	}

	int getSize() {
		// Implement the getSize() function here
        return heap.size();
	}

	int getMax() {
		// Implement the getMax() function here
        if(heap.isEmpty())
            return Integer.MIN_VALUE;
        return heap.get(0);
	}
    void insert(int element) {
        // Implement the insert() function here
       heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

    int removeMin() throws PriorityQueueException {
		// Complete this function
		// Throw the exception PriorityQueueException if queue is empty
         if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
        int temp = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int index =0;
        int minIndex=index;
        int lci= 1;
        int rci=2;
        while(lci<heap.size()){
            if(heap.get(lci)<heap.get(minIndex)){
                minIndex= lci;
            }
            if(rci<heap.size()&&heap.get(rci)<heap.get(minIndex)){
                minIndex= rci;
            }
            if(minIndex==index){
                break;
            }else{
                int temp1= heap.get(index);
                heap.set(index,heap.get(minIndex));
                heap.set(minIndex,temp1);
            }
            index= minIndex;
            lci = 2*index+1;
            rci = 2*index+2;
        }
        return temp;
	}
}
class PriorityQueueException extends Exception {

}

//     class PriorityQueueException extends Exception {

//     }

