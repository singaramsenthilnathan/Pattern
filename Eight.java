/*
11111111
11111122
11111333
11114444
11155555
11666666
17777777
88888888 */
public class Eight
{
public static void main(String[]args)
{
int j;
int n=7;
for(int i=1;i<=8;i++)
{
for(j=1;j<=n;j++)
{
System.out.print("1");
}
n--;
for(int k=1;k<=i;k++)
{
System.out.print(i);
}
System.out.println();
}
}
}
/* OUTPUT:
c:\java>java Eight
11111111
11111122
11111333
11114444
11155555
11666666
17777777
88888888
*/