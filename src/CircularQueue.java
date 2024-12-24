public class CircularQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;

    protected int front=0;
    protected int end=0;
    private int size=0;
    public CircularQueue()
    {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return size == data.length; //end is at last index
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        int removed=data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front()throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return;
        }
        int i=front;
        do
        {
            System.out.print(data[i]+" ");
            i++;
        } while(i!=end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue ob = new CircularQueue();

        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        ob.insert(5);

        ob.display();
        System.out.println(ob.remove());
        ob.insert(6);
        ob.display();
        //ob.front();

    }
}
