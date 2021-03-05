package java_oops;

public class ArrayInterview {

	public static void main(String[] args) {
/*  
 2 4 5
 3 4 7
 1 2 9
 */		
		int abc[][] = {{2,4,5},{3,-44,7},{1,2,-8}};
		int min=abc[0][0];
		for(int i=0;i<3;i++)  //scan row 
		{
			for (int j=0;j<3;j++)  //scan column  
			{
				if(abc[i][j]<min)
				{
					min = abc[i][j];
				}
			}
		}
		System.out.println(min);	
	}
}
