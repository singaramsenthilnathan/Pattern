/*
       *
      ***
     *****
    *******
   *********
  ***********
 *************
  ***********
   *********
    *******
     *****
      ***
       *
 */

package test;
public class Patt99 
{
public static void main(String[] args) 
{
	int n=1;
for(int i=1;i<=7;i++)
{
	for(int k=7;k>=i+1;k--)
	{
		System.out.print(" ");
	}
	
	for(int j=1;j<=n;j++)
	{
		System.out.print("*");
	}
	n=n+2;
	System.out.println();
}
int m=11;int d=6;
for(int a=1;a<=6;a++)
{
	for(int c=1;c<=a;c++)
	{
		System.out.print(" ");
	}
	for(int b=a;b<=m;b++)
	{
		System.out.print("*");
	}
	m=m-1;
	System.out.println();
}
}
}
/*
 * OUTPUT:

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *

*/
