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
1234567*/

public class Iq
{
public static void main(String[]args)
{
int n=7;
int m=1;
int c=6;
int v=1;


for(int j=7;j>=1;j--)
{
for(int x=7;x>=n;x--)
{
System.out.print(" ");
}
n--;
for(int i=m;i<=7;i++)
{
System.out.print(i);
}
m++;
System.out.println();
}
for(int a=6;a>=1;a--)
{
for(int x=6;x>=v;x--)
{
System.out.print(" ");
}
v++;
for(int b=c;b<=7;b++)	
{
System.out.print(b);
}
System.out.println();
c--;
}
}
}

/*OUTPUT:

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