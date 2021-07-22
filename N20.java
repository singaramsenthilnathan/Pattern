/*
   1
  2 2
 3 3 3
4 4 4 4
 3 3 3
  2 2
   1
 */
package test;
public class N20
{
public static void main(String[] args) 
{
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		int c=3;int f=2;
		for(int a=4;a>=1;a--)
		{
			for(int d=f;d>=1;d--)
			{
				System.out.print(" ");
			}
			f++;
			for(int b=a-1;b>=1;b--)
			{
				System.out.print(c+" ");
			}
			c--;
			System.out.println();
		}

	}

}
