/*
12345
23451
34521
45321
54321*/
public class NumPat
{
	
public static void main(String[]args)
{int n=1;int m=1;
for(int i=1;i<=5;i++)
{
for(int j=n;j<=5;j++)
{
System.out.print(j);
}
n++;
if(i>1)
{
for(int k=m;k>=1;k--)
{
System.out.print(k);
}
m++;
}
System.out.println();
}
}
}
