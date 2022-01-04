package com.cerner.tripletSum;

public class TripletSum {
	public int CheckPair(int array[],int sum,int n)
	{
		if(n<0 || n> array.length)
			throw new ArrayIndexOutOfBoundsException("Array should be within the Limits");
		else if(n==0)
			return 1;
		else 
		{

			for(int i=0;i<array.length;i++)
			{
				for(int j=i+1;j<array.length;j++)
				{
					if((array[i]+array[j])==sum)
						return 1;
				}
			}
			return -1;

		}
	}

}
