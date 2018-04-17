
public class ispowerof {
public static void main(String args[])
{
	int n=5;
	if(ispowerof(n)){
		System.out.println("is power of 2");
	}else{
		System.out.println("is not power of 2");
	}
}

private static boolean ispowerof(int n) {
	if(n<=0){
	return false;
	}
	return(n&(n-1))==0;
}
}
