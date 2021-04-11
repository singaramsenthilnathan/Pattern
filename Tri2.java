/*

*****6*****1
****56 ****3
***456  ***5
**       **7
*         *9
*         *
**       **
***     ***
****   ****
***** *****

*/

public class Tri2
{
public static void main(String[]args)
{
	int n=1;
	int m=1;
	int d=9;
	int e=1;
for(int i=1;i<=5;i++)
{
for(int j=5;j>=i;j--)
{
System.out.print("*");
}
for(int k=m;k<=n;k++)
{
	System.out.print("@");
}
n=n+2;
for(int x=5;x>=i;x--)
{
System.out.print("*");
}
System.out.println();
}
for(int a=1;a<=5;a++)
{
for(int b=1;b<=a;b++)
{
System.out.print("*");
}
for(int c=d;c>=e;c--)
{
System.out.print("@");
}
d=d-2;
for(int f=1;f<=a;f++)
{
System.out.print("*");
}
System.out.println();
}
}
}

/* OUTPUT:
*****@*****
****@@@****
***@@@@@***
**@@@@@@@**
*@@@@@@@@@*
*@@@@@@@@@*
**@@@@@@@**
***@@@@@***
****@@@****
*****@*****


*/
