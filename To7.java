/*
1
23
456
78910  */

public class To7
{
public static void main(String[]args)
{
int n=1;
for(int i=1;i<=4;i++)
{
for(int j=n;j<=i;j++)
{
System.out.print(j+" ");
}
n++;
i++;
System.out.println();
}
for(int k=4;k<=6;k++)
{
	System.out.print(k+" ");
}
System.out.println();
for(int l=7;l<=10;l++)
{
System.out.print(l+" ");
}
System.out.println();
}
}