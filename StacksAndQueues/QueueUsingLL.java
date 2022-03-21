package StacksAndQueues;

public class QueueUsingLL {
    
    //Define the data members
    private Node front;
    private Node rear;
    int size;


    public QueueUsingLL() {
        //Implement the Constructor
        front=null;
        rear=null;
        size=0;

    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
        //Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        Node temp = new Node(data);
        if(front==null){
            front=temp;
            rear= temp;
        }else{
            rear.next= temp;
            rear=temp;
        }
        size++;
    }


    public int dequeue() {
        //Implement the dequeue() function
        if(front==null){
            return -1;
        }
        int temp = front.data;
        front=front.next;
        size--;
        return temp;
    }


    public int front() {
        //Implement the front() function
        if(front==null)
        {
            return -1;
        }
    	return front.data;
    }
}
