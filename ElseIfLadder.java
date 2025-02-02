import java.util.Scanner;
public class ElseIfLadder{

public static void main(String[] args){
int mark;
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
mark = scan.nextInt();

if(mark>=90){
System.out.println(mark + " is A Grade");
}
else if(mark>=80){
System.out.println(mark + " is B Grade");
}
else if(mark>=70){
System.out.println(mark + " is C Grade");
}
else if(mark>=60){
System.out.println(mark + " is D Grade");
}
else{
System.out.println(mark + " is FAIL");
}
}
}