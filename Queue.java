public class Queue {
    public static Object[] queue;
    public static int size;
    public static int front;
    public static int rear;
    public Queue(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        queue  = new Object[size];
    }
    public void enqueue(Object val){
        if(rear==size-1 ) {
			System.out.println("Queue is Full");
		}
		else {
		rear++;
		queue[rear]=val;
		}   
    }
    public void dequeue(){
        if(rear == -1){
            System.out.println("Queue is empty");
        }
        else{
            front++;
            System.out.println(queue[front]);
    
        }
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(queue[i]);
        }
    }
    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enqueue(6);
        q.enqueue(5);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(8);
        q.display();
        q.dequeue();
        q.dequeue();
       }
}
