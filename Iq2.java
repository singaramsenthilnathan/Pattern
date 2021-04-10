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
 1234567 */
public class Iq2
{
public static void main(String[]args)
{
int n=7;
int g=7;
int c=7;
int f=1;
int h=6;
for(int a=6;a>=1;a--)
{
for(int d=a;d<=6;d++)
{
System.out.print(" ");
}
//h--;
for(int b=f;b<=7;b++)
{
System.out.print(b+" " );
}
f++;
System.out.println();
}
for(int i=7;i>=1;i--)
{
for(int k=1;k<=g;k++)
{
System.out.print(" ");
}
g--;
for(int j=n;j<=7;j++)
{
System.out.print(j+" ");
}
n--;
System.out.println();
}
}
}


/*OUTPUT:
 1 2 3 4 5 6 7
  2 3 4 5 6 7
   3 4 5 6 7
    4 5 6 7
     5 6 7
      6 7
       7
      6 7
     5 6 7
    4 5 6 7
   3 4 5 6 7
  2 3 4 5 6 7
 1 2 3 4 5 6 7
 
 
 */