import java.util.*;
public class Electricity{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=10, b=12, c=15, d=18, e=20;
        int total = 0;

        //Customer Detail
        System.out.println("---------------Customer Login---------------");
        System.out.println("Enter User Name:- ");
        String name = sc.nextLine();
        System.out.println("Enter Bill ID:- ");
        int id = sc.nextInt();
        System.out.println("Enter Units Used:- ");
        int use = sc.nextInt();
        
        //Count bill by units
        if(use<0){
            System.out.println("Invalid Units");
        }else if(use <= 100){
            total = use*10;
        }else if(use <= 250){
            total = use*12;
        }else if(use <= 350){
            total = use*15;
        }else if(use <= 400){
            total = use*18;
        }else{
            total = use*20;
        }

        //customer care
        while(true){
        System.out.println("---------------Choose Operation----------------\n A.Print Bill\n B.Calculation\n C.Help\n D.Exit\n ---------------Enter Operation---------------");
        char op = sc.next().charAt(0);

        switch(op){
            case 'A':
            case 'a':
                    System.out.println("---------------Electricity Bill---------------");
                    System.out.println("Customer Name:- "+name);
                    System.out.println("Customer ID:- "+id);
                    System.out.println("Units Used:- "+use);
                    System.out.println("Total Bill:- "+total);
                    System.out.println("----------------------------------------------");
                    break; 

            case 'B':
            case 'b':
                    if(use <=100){
                        System.out.println("----------------------------------------------");
                        System.out.println("Calculation By Original Units:- "+use+" * "+a );
                        System.out.println("Total Bill Charge:- "+total);
                        System.out.println("----------------------------------------------");
                    }
                    else if(use <= 250){
                        System.out.println("----------------------------------------------");
                        System.out.println("Calculation By Original Units:- "+use+" * "+b);
                        System.out.println("Total Bill Charge:- "+total);
                        System.out.println("----------------------------------------------");
                    }
                    else if(use <= 350){
                        System.out.println("----------------------------------------------");
                        System.out.println("Calculation By Original Units:- "+use+" * "+c );
                        System.out.println("Total Bill Charge:- "+total);
                        System.out.println("----------------------------------------------");
                    }
                    else if(use <= 400){
                        System.out.println("----------------------------------------------");
                        System.out.println("Calculation By Original Units:- "+use+" * "+d );
                        System.out.println("Total Bill Charge:- "+total);
                        System.out.println("----------------------------------------------");
                    }
                    else{
                        System.out.println("----------------------------------------------");
                        System.out.println("Calculation By Original Units:- "+use+" * "+e );
                        System.out.println("Total Bill Charge:- "+total);
                        System.out.println("----------------------------------------------");
                    }
                    break;

            case 'C':
            case 'c':
                    System.out.println("----------------------------------------------");
                    System.out.println("Emergency Number: xxxxxxxxxx\n Helping Time 24x7");
                    System.out.println("----------------------------------------------");
                    break;

            case 'D':
            case 'd':
                    System.out.println("----------------------------------------------");
                    System.out.println("Thank You For Using Our Service. Please Visit Again.");
                    System.out.println("----------------------------------------------");
                    System.exit(0);
            default:
                System.out.println("----------------------------------------------");
                System.out.println("Invalid Choice! Please Enter A, B, C, or D.");
                System.out.println("----------------------------------------------");
                break;
            }
        }
    }
}