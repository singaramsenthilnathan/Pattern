/*
$ # # # # # #
$ $ # # # # #
$ $ $ # # # #
$ $ $ $ # # #
$ $ $ $ $ # #
$ $ $ $ $ $ #
$ $ $ $ $ $ $
 */
package HiTech;
public class Dollar 
{
public static void main(String[] args) 
{	
	int m=6;
for(int i=1;i<=7;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("$"+" ");
	}
	for(int k=m;k>=1;k--)
	{
		System.out.print("#"+" ");
	}
	m--;
	System.out.println();
}
}
}
