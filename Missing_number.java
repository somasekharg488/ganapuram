package javaprograms;

import java.util.ArrayList;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a[] = { 0,3,4,5,6,7,10 };
		int j = a[0];
		for (int i=0;i<a.length;i++)
		{
		    if (j==a[i])
		    {
		        j++;
		        continue;
		    }
		    else
		    {
		        arr.add(j);
		        i--;
		    j++;
		    }
		}
		System.out.println("missing numbers are ");
		for(int r : arr)
		{
		    System.out.println(" " + r);
		}
	}

}
