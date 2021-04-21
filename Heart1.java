/*
 **   **
**** ****
*********
 *******
  *****
   ***
    *
*/


public class Heart1
{
public static void main(String[]args)
{
int p=1,l=2,n=2,m=1;
int d=0,f=3,y=4;
System.out.print(" ");
for(int i=2;i>=1;i--)
{
for(int j=n;j>=m;j--)
{
System.out.print("*");
}
n=n*2;
for(int e=f;e>=1;e--)
{
System.out.print(" ");
}
f=f-2;
for(int k=l;k>=p;k--)
{
System.out.print("*");
}
l=l*2;
System.out.println();
}
for(int a=5;a>=1;a--)
{
for(int c=1;c<=d;c++)
{
System.out.print(" ");
}
d++;
for(int b=a;b>=1;b--)
{
System.out.print("*");
}
for(int x=y;x>=1;x--)
{
System.out.print("*");
}
y--;
System.out.println();
}
}
}

/* OUTPUT:

       *  *  $  $  $  *  *
    *  *  *  *  $  *  *  *  *
    *  *  *  *  *  *  *  *  *
       *  *  *  *  *  *  *
          *  *  *  *  *
             *  *  *
                *
				
*/

//2
//4
//5
//4
//3
//2
//1