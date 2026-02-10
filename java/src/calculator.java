import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);

        System.out.println("enter the operator");

        while(true){
            char op=in.next().trim().charAt(0);
            if(op =='+'|| op == '-'|| op == '*'|| op == '%'){
                System.out.println("enter two numbers");
                int a=in.nextInt();
                int b=in.nextInt();
                if(op=='+'){
                    System.out.println(a+b);
                }
                if(op=='-'){
                    System.out.println(a-b);
                }
                if(op=='*'){
                    System.out.println(a*b);
                }
                if(op=='%'){
                    System.out.println(a%b);
                }
        } else if (op=='x'||op=='X'){
                break;
            }
            else{
                System.out.println("invalid opeartor");
            }
        }
    }
}
