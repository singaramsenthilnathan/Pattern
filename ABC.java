package test.second;
public class ABC 
{
public static void main(String[] args)
{
for(int i=1;i<=4;i++)
{
int alphabet = 65;
for(int j=i;j>=1;j--)
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
A B 
A B C 
A B C D 
*/
