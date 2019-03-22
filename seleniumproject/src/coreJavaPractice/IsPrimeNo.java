package coreJavaPractice;

public class IsPrimeNo {

	public static void main(String[] args) {

		System.out.println(isprime(11)+"------is prime");
		System.out.println(getPrimes(11));


	}
	
	
	public static boolean isprime(int n) {
		
		if(n<=1) {
			return false;
			
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		System.out.println(n+"===is prime");
		return true;
	}
	
	public static int getPrimes(int n) {
		System.out.println("Prime nos in  "+n);
		for(int i=2;i<n;i++) {
		if(isprime(i)) {
			//System.out.println(i);
		}
	}
		return n;
	
	
	}	

}
