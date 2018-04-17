import java.util.Scanner;


public class Check {
public static void main(String args[]){
	String s1,s2;
	Scanner s=new Scanner(System.in);
	System.out.println("enter s1");
	s1=s.nextLine();
	System.out.println("enter s2");
	s2=s.nextLine();
	if(s1.compareTo(s2)>0)
		System.out.println("s1 greater then s2");
	else if(s1.compareTo(s2)<0)
			System.out.println("s1 less then s2");
	else
		System.out.println("s1 equals s2");
	}
}

