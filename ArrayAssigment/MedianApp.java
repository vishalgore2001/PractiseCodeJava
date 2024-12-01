/* 2)	Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
*/
//============================================================================
import java.util.Scanner;
class MedianApp{
public static void main(String x[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size of   first array");
	int size1=sc.nextInt();
	System.out.println("Enter the size if second Array :");
	int size2=sc.nextInt();
	int A1[]=new int [size1];
	int A2[]=new int[size2];
	int m[]=new int [size1+size2];
		System.out.println("Enter the first array Elements:");
		for(int i=0;i<A1.length;i++){
			A1[i]=sc.nextInt();
		}
		System.out.println("Enter the second Array Elements:");
		for(int i=0;i<A2.length;i++){
			A2[i]=sc.nextInt();
		}
		for(int i=0;i<A1.length;i++){
			m[i]=A1[i];
		}
		for(int i=0;i<A2.length;i++){
			m[A1.length-1+i]=A2[i];
		}
		System.out.println("Display the sorted Array :");
		for(int i=0;i<size1+size2;i++){
			System.out.print(m[i]+"\t");
		}

	}
}