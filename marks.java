import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks= input.nextInt();
        if(marks>=90)
            System.out.println("A");
        else{
            if(marks>=80)
                System.out.println("B");
            else {
                if(marks>=70){
                    System.out.println("C");
                }
                else
                   {
                     if(marks>=60){
                        System.out.println("D");
                     }
                     else
                        System.out.println("F");
                   }

            }
        }
        }
    }

