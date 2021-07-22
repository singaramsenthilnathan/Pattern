/*
1234567
  234567
    34567
      4567
        567
          67
            7
          67
        567
      4567
    34567
  234567
1234567
 */

package test;
public class N9
{
public static void main(String[] args) 
{
	for(int i=1;i<=7;i++)
	{
		for(int k=1;k<=i;k++)
		{
			System.out.print(" "+" ");
		}
		for(int j=i;j<=7;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}
	for(int a=6;a>=1;a--)
	{
	for(int c=1;c<=a;c++)
	{
		System.out.print(" "+" ");
	}
		for(int b=a;b<=7;b++)
		{
			System.out.print(b+" ");
		}
		System.out.println();
	}
}
}
