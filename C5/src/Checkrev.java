import java.util.Scanner;


public class Checkrev {
public static void main(String args[]){
	Scanner sc=new Scanner (System.in);
	System.out.println("enter string");
	String s=sc.nextLine();
	System.out.println("enter the string:"+Strrev(s));
}
private static int Strrev(String s){
	if(s.equals(""))
		return 0;
		else
			return Strrev(s.substring(1))+1;
	}
	
}

