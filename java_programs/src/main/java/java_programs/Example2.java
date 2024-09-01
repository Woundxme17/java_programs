//Java Program to find the frequency of each element in the array

package java_programs;

public class Example2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 8, 3, 2, 2, 2, 5, 1 };

		int[] frequency = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) 
		{
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited) 
			{
				frequency[i] = count;
			}
		}
		for (int i = 0; i < frequency.length; i++) 
		{	
			if (frequency[i] != visited) 
			{
				System.out.println("Element: " + arr[i] + " | Frequency: " + frequency[i]);
			}
		}

	}

}
