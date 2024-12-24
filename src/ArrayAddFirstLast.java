import java.util.Scanner;

public class ArrayAddFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }

        int[] res=nums;
        while(true)
        {
            nums = firstlastsum(res);
            if(nums.length<=2)
            {
                break;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]);
        }
    }

    static int[] firstlastsum(int[] arr)
    {
        int start=0,end=arr.length-1;
        int[] temp = new int[arr.length];
        int sum=0,i=0;
        while(start<end)
        {
            sum=start+end;
            temp[i]=sum;
            i++;
            start++;
            end--;
        }
        return temp;
    }
}
