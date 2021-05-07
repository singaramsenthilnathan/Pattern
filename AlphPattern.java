package test.second;
public class AlphPattern
{
public static void main(String[] args) 
{
int alphabet = 65;
for(int i=1;i<=4;i++)
{
	
for(int j=1;j<=i;j++)
{
System.out.print((char)alphabet+" ");
alphabet++;
}
System.out.println();
}
}
}
/* OUTPUT:
A 
B C 
D E F 
G H I J 
*/
