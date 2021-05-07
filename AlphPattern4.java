package test.second;
public class AlphPattern4
{
	static int alphabet = 69;
public static void main(String[] args) 
{
for(int i=5;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print((char)alphabet+" ");
}
alphabet--;
System.out.println();
}
}
}
/* OUTPUT:
E E E E E 
D D D D 
C C C 
B B 
A 
*/
