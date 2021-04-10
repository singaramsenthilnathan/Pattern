/*
1
121                      1
12321                    21
1234321                 321
123454321                4321
12345654321               54321
1234567654321*/           /* 654321*/

public class Tough
{
public static void main(String[]args)
{
for(int i=1;i<=7;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
if(j==2 && i==2)
System.out.print(1);
if(j==3 && i==3)
System.out.print(21);
if(j==4 && i==4)
System.out.print(321);
if(j==5 && i==5)
System.out.print(4321);
if(j==6 && i==6)
System.out.print(54321);
if(j==7 && i==7)
System.out.print(654321);
}
System.out.println();
}
}
}

/* OUTPUT:
1
121
12321
1234321
123454321
12345654321
1234567654321
*/