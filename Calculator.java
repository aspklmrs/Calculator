import java.util.*;
public class Calculator{
    public static void main(String ss[]){
        Scanner sc=new Scanner(System.in);
        boolean exit=true;
        while(exit)
        {
            System.out.println("###################################################");
            System.out.println("Enter a Nmber");//Inputting Data
            int a=sc.nextInt();
            System.out.println("Enter another Nmber");
            int b=sc.nextInt();
            System.out.println("###################################################");
            System.out.println("---------------------MENU-------------------------");//Menu Program for Calculator
            System.out.println("1. For Addition");
            System.out.println("2. For Multiplication");
            System.out.println("3. For Subraction");
            System.out.println("4. For Division");
            System.out.println("5. For Exit");
            System.out.println("Enter Your Choice");
            switch(sc.nextInt())
            {
                case 1:
                        System.out.println("Addition :"+(a+b));//Addition of numbers
                        break;
                case 2:
                        System.out.println("Multiplication :"+(a*b));//Multipication of numbers
                        break;
                case 3:
                        System.out.println("Subraction :"+(a-b));//Subraction of numbers
                        break;
                case 4:
                        if(b!=0)
                        {
                        System.out.println("Division :"+(a/(float)b));//Division  oof numbers
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