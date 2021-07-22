/*
 1 2 3 4 5 6 7 
  2 3 4 5 6 7 
   3 4 5 6 7 
    4 5 6 7 
     5 6 7 
      6 7 
       7 
      6 7 
     5 6 7 
    4 5 6 7 
   3 4 5 6 7 
  2 3 4 5 6 7 
 1 2 3 4 5 6 7 
 */
package test;
public class N12
{
public static void main(String[] args) 
{
	for(int i=1;i<=7;i++)
	{
		for(int k=1;k<=i;k++)
		{
			System.out.print(" ");
		}
		for(int j=i;j<=7;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for(int a=6;a>=1;a--)
	{
		for(int c=a;c>=1;c--)
		{
			System.out.print(" ");
		}
		for(int b=a;b<=7;b++)
		{
			System.out.print(b+" ");
		}
		System.out.println();
	}

	}

}
