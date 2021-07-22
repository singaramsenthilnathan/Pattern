/*
      A 
     B B 
    C C C 
   D D D D 
  E E E E E 
 F F F F F F 
 */

package test;
public class Alph5
{
public static void main(String[] args) 
{
	int alph=65;
	for(int i=1;i<=6;i++)
	{
		for(int k=6;k>=i;k--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)alph+" ");
		}
		alph++;
		System.out.println();
	}
	}
}
