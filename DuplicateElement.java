package programs.array;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,4,5,6,7,8,9,9};

		System.out.println("List of duplicate elements");
		//searching duplicate elements
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
					System.out.println(arr[i]);
			}
		}
	}

}
