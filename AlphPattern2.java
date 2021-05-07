package test.second;
public class AlphPattern2 
{
	static int alphabet =65;
public static void main(String[] args)
{
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
{
	System.out.print((char)alphabet+" ");
}
alphabet++;
System.out.println();
}
}
}
/*
A 
B B 
C C C 
D D D D 
*/
