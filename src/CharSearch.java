import java.util.Scanner;

public class CharSearch {

    public static int getStringIndex(String name,char ch)
    {
        for(int i=0;i<name.length();i++)
        {
            if(ch == name.charAt(i))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char ch = sc.next().charAt(0);
        int index = getStringIndex(word,ch);
        System.out.println("Index = "+(index+1));
    }
}
