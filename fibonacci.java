import java.util.Scanner;
public class fibonacci {
    public static  void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number:");
        int n=input.nextInt();
        int a=-1;
        int b=1,c;
        for(int i=1;i<=n;i++){
             c=a+b;
           System.out.print(c);
           a=b;
           b=c;

            
        
        }
    }
    
}
