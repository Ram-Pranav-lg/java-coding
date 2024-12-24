import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int x = sc.nextInt();
        boolean flag = false;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] == x) {
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println(x + " is present in the " + (i+1) + " position");
        else
            System.out.println("Element Not found!");


    }
}
