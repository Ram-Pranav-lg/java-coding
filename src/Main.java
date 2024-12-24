import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i,a=0,b=1,c;
        if(n<=1){
            System.out.print(a+",");
        }
        else if(n==2)
            System.out.print(a+","+b+",");
        else{
            System.out.print(a+","+b+",");
            c=0;
            for(i=2;i<n;i++){
                c=a+b;
                System.out.print(c+",");
                a=b;
                b=c;
            }
        }

       //System.out.print();
    }
}