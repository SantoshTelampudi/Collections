package com.collections;

public class ArrayConcepts {


	public int roll_no; 
	public String name; 
	public ArrayConcepts(int roll_no, String name) 
	{ 
		this.roll_no = roll_no; 
		this.name = name; 
	} 

	public ArrayConcepts() {
	}

	public void ArrayImplementation() {
		// declares an Array of integers. 
		int[] arr; 

		// allocating memory for 5 integers. 
		arr = new int[5]; 

		// initialize the first elements of the array 
		arr[0] = 10; 

		// initialize the second elements of the array 
		arr[1] = 20; 

		//so on... 
		arr[2] = 30; 
		arr[3] = 40; 
		arr[4] = 50; 

		// accessing the elements of the specified array 
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at index " + i +" : "+ arr[i]);    

	}

	public void ArrayAsOnObject() {

		ArrayConcepts[] arr;
		arr = new ArrayConcepts[3];
		arr[0] = new ArrayConcepts(1,"Santosh");
		arr[1] = new ArrayConcepts(2,"Vinod");
		arr[2] = new ArrayConcepts(3,"Raghu");
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at " + i + " : " + arr[i].roll_no +" "+ arr[i].name); 	

	}

	public void Array2dDimension() {
		// declaring and initializing 2D array 
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 

		// printing 2D array 
		for (int i=0; i< 3 ; i++) 
		{ 
			for (int j=0; j < 3 ; j++) 
				System.out.print(arr[i][j] + " "); 

			System.out.println(); 
		}
	}

	public void ArraySum1()
	{
		int arr[] = {3, 1, 2, 5, 4}; 

		// passing array to method m1 
		int j =  sum(arr); 
		System.out.println(j);

	}

	public int sum(int[] arr) {
		// getting sum of array values 
		int sum = 0; 

		for (int i = 0; i < arr.length; i++) 
			sum+=arr[i]; 

		return sum;
	}

	public void rotateArrayusingDN()
	{
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		/*array need to be printed is { 3,4,5,6,7,1,2}
		 * so we need to move the value 2 times, so d = 2
		 * and total number of values is 7 so n =7*/
		int d = 2;
		int n = 7;

		for(int i=0;i<d;i++)
		{
			int temp;
			temp = arr[i];
			for(int j = 0;j<n-1;j++)
			{
				arr[j] = arr[j+1];
			}
			arr[n-1] = temp;
		}
		for (int k = 0; k < n; k++)
			System.out.print(arr[k] + " ");

	}
	
	

}
