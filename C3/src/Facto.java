import java.util.Scanner;


public class Facto {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int num=sc.nextInt();
	int factorial=fact(num);
	System.out.println("factrial is:"+factorial);
}

 static int fact( int n) {
int output;
if(n==1){
	return 1;
}
output=fact(n-1)*n;
	return output;
}
}
