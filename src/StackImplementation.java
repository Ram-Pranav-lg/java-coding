public class StackImplementation {
    protected int[] data;
    private static int max_size = 5;
    int ptr=-1;

    public StackImplementation()
    {
        this(max_size);
    }
    public StackImplementation(int size)
    {
        this.data = new int[size];
    }

    public boolean push(int item) throws Exception {
        if(ptr == max_size-1)
        {
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if(ptr == -1)
        {
            throw new Exception("Cannot Pop from Empty Stack!!!");
        }
        return data[ptr--];
    }

    public void display()
    {
        if(ptr==-1)
        {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("The given values are:");
        for(int i=ptr;i>=0;i--)
            System.out.println(data[i]);
    }

    public static void main(String[] args) throws Exception {
        StackImplementation ob = new StackImplementation(5);

        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);

        ob.display();
        ob.pop();
        //ob.pop();
        ob.display();
    }


}
