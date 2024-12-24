public class QueueImplementation {
    private int[] data;
    private static final int DEFAULT_SIZE = 5;
    int end=0;

    public QueueImplementation()
    {
        this(DEFAULT_SIZE);
    }

    public QueueImplementation(int size) {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return end == data.length;//end is at last index
    }

    public boolean isEmpty()
    {
        return end == 0;
    }

    public boolean insert(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Queue is full");
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        int removed=data[0];
        //shift the elements to the left
        for(int i=1;i<end;i++)
        {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front()throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display()
    {
        for(int i=0;i<end;i++)
        {
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        QueueImplementation ob = new QueueImplementation();

        ob.insert(1);
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        ob.insert(5);
        //ob.insert(6);
        ob.display();
        System.out.println(ob.remove());
        ob.display();
        //ob.front();

    }

}
