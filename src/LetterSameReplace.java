import java.util.Scanner;

public class LetterSameReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        StringBuilder res = new StringBuilder();

        for(int i=0;i<=s1.length()-1;i++)
        {
            boolean flag=false;
            char ch1=s1.charAt(i);

            for(int j=0;j<=s2.length()-1;j++)
            {
                char ch2=s2.charAt(j);
                if(ch1 == ch2)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag) {
                res.append(ch1);
            }
        }
        System.out.println("Modified string = "+res.toString());
    }
}
