/*1)	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
*/
//=============================================================================================
import java.util.Scanner;
class TargetApp{
public static void main(String x[]){
	Scanner sc =new Scanner(System.in);

	System.out.println("Enter the target :");
	int target=sc.nextInt();
	System.out.println("Enter  the array elements");	
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
		System.out.println("Display the given information");
	for(int i=0;i<a.length;i++)
	{
		
		System.out.print(a[i]+"\t");
	}
	System.out.println("\nThis pair match the given target");
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]+a[j]==target){
				System.out.println(i+" \t"+ j);
			}
		}
	}
    }
}