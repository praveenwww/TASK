import java.util.Scanner;
public class OddNum{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

try{
System.out.println("Enter a number");
int num = scan.nextInt();
if(num%2!=0)
{
throw new ArithmeticException("Its a Odd Number");
}
}

catch(ArithmeticException e){
System.out.println(e);
}
System.out.println("End of Program1");
}
}
