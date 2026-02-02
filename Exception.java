import java.util.Scanner;

    class Exception{
        public static void main(String[]args){
            int a,b,c;
            try{
                a=10;
                b=0;
                c=a/b;
            }
            catch(ArithmeticException e){
                System.out.println("Not divisible by Zero");
            }

    }
}