package java_oops;

import java.util.ArrayList;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		
		
		int a[]= {4,5,5,5,4,3,6,3,2,2,6}; //Print unique number
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!a1.contains(a[i]))
			{
				a1.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if(k==1)
				{
					System.out.println("My unique number is = "+ a[i]);
				}
			}
		
		}
		
	}
	
	
}
