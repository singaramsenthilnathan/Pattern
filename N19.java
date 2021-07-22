/*
1
2 13
3 12 14
4 11 15 22
5 10 16 21 23
6 9 17 20 24 27
7 8 18 19 25 26 28
 */
package test;
public class N19
{
public static void main(String[] args) 
{
	int k=7;
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
