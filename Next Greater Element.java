/*Given an array of integers. For each element in the array, find its next greater element in that array.
The next greater element is the first element towards right, which is greater than the current element. Example -
Input: arr = {4, 7, 3, 4, 8, 1}
Output: arr = {7, 8, 4, 8, -1, -1} */


package Demo;
import java.util.*;

public class NextGreaterElement {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Enter the number of Element in an Array");
	n=sc.nextInt();
	System.out.println("Enter the array Elements");
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int m;
	for(int i=0;i<n;i++) {
		m=arr[i];
		
		for(int j=i+1;j<n;j++){
			if(arr[j]>m) {
				arr[i]=arr[j];
				break;
			}
		}
		if(arr[i]==m) {

				arr[i]=-1;
		}
	}
	System.out.println("New Array is =");
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	sc.close();
}
}
