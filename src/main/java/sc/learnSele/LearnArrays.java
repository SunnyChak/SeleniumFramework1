package sc.learnSele;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1, 2, 3, 4, 5, 6};
		String[] arr1 = {"Sunny"};
	
		
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println(arr[i]);
				//break;
			}
			
		}
		

		for(String s:arr1)
		{
			System.out.println(s);
		}
	
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Sunny");
		a.add("Jena");
		a.add("Chakraborty");
		a.add("Banerjee");
		a.get(1);
		
		System.out.println(a.get(1));
		
		
		
		for(int j=0; j<a.size(); j++)
		{
			System.out.println(a.get(j));
			
		}
		System.out.println("********");
		
		for( String al:a)
		{
			System.out.println(al);
		}
		
		System.out.println(a.contains("Jena"));
		
		
		//convert normal array to arraylist
		
		//List<String> nameArrayList =  Arrays.asList(arr);
		
		
		
	}

}
