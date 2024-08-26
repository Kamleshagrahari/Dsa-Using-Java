//{ Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}




// } Driver Code Ends




class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code \
	    arr[rear]=x;
	    rear++;
	    
	   
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(front==rear){
		    return -1;
		}
		int x=arr[front];
		front=front+1;
		return x;
	} 
}


// class queue{
//     int size=5;
//     int[] arr=new int[size];
//     int front=-1;
//     int rear=-1;

//     void insert(int data){
//         if(rear==size-1){
//             System.out.println("Queue is full");
//     }else{
//         rear=rear+1;
//         arr[rear]=data;
//         if(front==-1){
//             front=front+1;
//         }
//     }
//     }
//     void del(){
//         if(front==-1 && rear==-1){
//             System.out.println("Queue is empty");
//     }else{
//         int x=arr[front];
//         front=front+1;
//         System.out.println(x);
//     }
// }
// void display(){
//     if(front==-1 && rear==-1){
//         System.out.println("empty");
//     }else{
//         for(int i=front;i<=rear;i++){
//             System.out.println(arr[i]);
//     }
// }
// }
// }
// public class queue_using_array {
//     public static void main(String[] args) {

//         queue q=new queue();
//         q.insert(0);
//         q.insert(1);
//         q.insert(2);
//         q.display();
//         q.del();
//         q.display();
      

        
//     }
    
// }




