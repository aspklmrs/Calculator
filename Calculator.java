import java.util.*;
public class Calculator{
    public static void main(String ss[]){
        Scanner sc=new Scanner(System.in);
        boolean exit=true;
        while(exit)
        {
            System.out.println("###################################################");
            System.out.println("Enter a Nmber");
            int a=sc.nextInt();
            System.out.println("Enter another Nmber");
            int b=sc.nextInt();
            System.out.println("###################################################");
            System.out.println("---------------------MENU-------------------------");
            System.out.println("1. For Addition");
            System.out.println("2. For Multiplication");
            System.out.println("3. For Subraction");
            System.out.println("4. For Division");
            System.out.println("5. For Exit");
            System.out.println("Enter Your Choice");
            switch(sc.nextInt())
            {
                case 1:
                        System.out.println("Addition :"+(a+b));
                        break;
                case 2:
                        System.out.println("Multiplication :"+(a*b));
                        break;
                case 3:
                        System.out.println("Subraction :"+(a-b));
                        break;
                case 4:
                        if(b!=0)
                        {
                        System.out.println("Division :"+(float)(a/b));
                    }
                        else
                        {
                        System.out.println("Division by Zero is not possible");
                        }
                        break;
                case 5:
                        System.out.println("------PROGRAM TERMINATED------");
                        exit=false;
                        break;
                default:
                    System.out.println("Invalid Choice");
            };
          
        };
    }
}