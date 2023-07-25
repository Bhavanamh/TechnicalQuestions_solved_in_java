/*The number is said to be twisted prime number ,the reverse of the number lso prime number */

package terv;
import java.util.*;
public class TwistedPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int res1=isPrime(num);
		if(res1==1) {
			System.out.print("The entered Number "+num+" is  a Prime Number");
		}
		else {
			System.out.println("The entered Number:"+num+" is not a Prime Number");
			
		}
		System.out.println();
		int temp=num,rev=0;
		while(temp>0) {
			int r=temp%10;
			rev=rev*10+r;
			temp=temp/10;
		}
		System.out.println("The reverse of a Given Number is:"+rev);
		int res2=isPrime(rev);
		if(res2==1) {
			System.out.println("The  Number:"+num+" is a Twisted Prime Number");
		}
		else {
			System.out.println("The entered Number:"+num+" is not a Twisted  Prime Number");
		
		}
		sc.close();
	}
	public static int isPrime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				return 0;
			}
		}
		return 1;
	}

}
