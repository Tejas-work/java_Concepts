package java_oops;

public class ArrayInterview2 {

	public static void main(String[] args) {
		//Print max from column, which is minimum in entire array.
		
		//To find minimum number using i and j 
		int abc[][] = { { 12, 3, 88 }, { 3, 67, -88 }, { 1, -66, 11 } };
		int min = abc[0][0];
		int mincolumn=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					mincolumn=j; //Identify column of minimum number
				}
			}
		}
		
		//find maximum number in identified column 
		int max=abc[0][mincolumn];
		int k=0;
		while(k<3)
		{
			if(abc[k][mincolumn]>max)
		{
			max=abc[k][mincolumn];
		}
		k++;
		
		}
		
		System.out.println(max);
	}
}
