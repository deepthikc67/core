import java.util.Scanner;


public class Check {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	System.out.println("Gcd of num:"+gcd(n1,n2));
	System.out.println("lcm of num:"+lcm(n1,n2));
	s.close();
}
public static int gcd(int a,int b){
	if(b==0)
		return a;
	else
		return gcd(b,a%b);
}
public static int lcm(int a,int b){
	
		return  a*b /gcd(a,b);
}
}
