/*
                   *
                 * *
               * * *
             * * * *
           * * * * *
             * * * *
               * * *
                 * *
                   *  
 */

package test;
public class Dai2
{
public static void main(String[] args) 
{
for(int i=1;i<=5;i++)
{
	for(int k=5;k>=i;k--)
	{
		System.out.print(" ");
	}
	for(int j=i;j>=1;j--)
	{
		System.out.print("*");
	}
	System.out.println();
}
int f=2;
for(int a=4;a>=1;a--)
{
 for(int c=f;c<=a-1;c++)
 {
	 System.out.print(" ");
 }
 f=f-2;
	for(int b=a;b>=1;b--)
	{
		System.out.print("*");
	}
	System.out.println();
}
}

}
