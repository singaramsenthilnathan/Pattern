/*
1
2 6
3 7 10 
4 8 11 13
5 9 12 14 15
 */
package test;
public class N15
{
public static void main(String[] args) 
{
	int k=5;
	for(int i=1;i<=k;i++)
	{
		int n=i;
		for(int j=1;j<=i;j++)
		{
			System.out.print(n+" ");
			n=n+k-j;
		}
		System.out.println();
		
	}

	}

}
