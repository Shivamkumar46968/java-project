import java.util.Scanner;
public class print {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter a number:");
        int n= input.nextInt();
        int i=1;
        // for(i=1;i<=n;i++){
        //     System.out.println(i);
        // }  
        while(i<=n){
            System.out.println(i);
            i+=1;
        }
    }
    
}
