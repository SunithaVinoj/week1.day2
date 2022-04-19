package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args)
	{
	int[] arr = {1,2,3,4,7,6,8};
	int i,j=1;
	Arrays.sort(arr);
	
	
	for(i=arr[0];i<=arr.length;i++)
	{
		if (i!=arr[i-1])
		{
			System.out.println("Missing Element in an Array is "+ i);
			break;
		}
	}
	
	
	}
	

}
