package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args)
	{
		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		int i,j;
		
		System.out.println("Intersection of an array is");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				
				if(arr1[i]==arr2[j])
					
					System.out.println(arr1[i]);
					
			}
		}	
		
	}
}
