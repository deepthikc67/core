import java.util.Scanner;


public class Length {
public static void main(String args[]){
	int len;
	String s;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the string");
	s=sc.nextLine();
	len=s.length();
	System.out.println("entered len is:" +len);
}
}
