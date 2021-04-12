/*
*****@*****
****@@@****
***@@@@@***
**@@@@@@@**
*@@@@@@@@@*
@@@@@@@@@@@
*@@@@@@@@@*
**@@@@@@@**
***@@@@@***
****@@@****
*****@*****
*/

public class Vetri
{
public static void main(String[]args)
{
int n=1,y=9;
for(int i=5;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print("*"+" ");
}
for(int k=1;k<=n;k++)
{
System.out.print("@"+" ");
}
n=n+2;
for(int l=1;l<=i;l++)
{
System.out.print("*"+" ");
}
System.out.println();
}
for(int a=1;a<=11;a++)
{
System.out.print("@"+" ");
}
System.out.println();
for(int b=1;b<=5;b++)
{
for(int c=1;c<=b;c++)
{
System.out.print("*"+" ");
}
for(int x=1;x<=y;x++)
{
System.out.print("@"+" ");
}
y=y-2;
for(int z=1;z<=b;z++)
{
System.out.print("*"+" ");
}
System.out.println();
}
}
}

/* OUTPUT:

* * * * * @ * * * * *
* * * * @ @ @ * * * *
* * * @ @ @ @ @ * * *
* * @ @ @ @ @ @ @ * *
* @ @ @ @ @ @ @ @ @ *
@ @ @ @ @ @ @ @ @ @ @
* @ @ @ @ @ @ @ @ @ *
* * @ @ @ @ @ @ @ * *
* * * @ @ @ @ @ * * *
* * * * @ @ @ * * * *
* * * * * @ * * * * *

*/
