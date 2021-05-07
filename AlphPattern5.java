package test.second;
public class AlphPattern5 
{
public static void main(String[] args) 
{
for(int i=1;i<=5;i++)
{
int alphabet = 70;
alphabet =alphabet-i;
for(int j=5;j>=i;j--)
{
System.out.print((char)alphabet+" ");
alphabet--;
}
System.out.println();
}
}
}
/*OUTPUT:
E D C B A 
D C B A 
C B A 
B A 
A 
*/
