/*
     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
 */

package test;
public class AlphPatt4
{
public static void main(String[] args)
{
	for(int i=1;i<=6;i++)
	{
		for(int k=6;k>=i;k--)
		{
			System.out.print(" ");
		}
		int alph=65;
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)alph+" ");
			alph++;
		}
		System.out.println();
	}
}
}
