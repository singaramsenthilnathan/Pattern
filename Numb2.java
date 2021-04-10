public class Numb2
{
public static void main(String[]args)
{
for(int i=1;i<=7;i++)
{
for(int k=6;k>=i;k--)
{
System.out.print("1");
}
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();

}
}
}
/*OUTPUT:
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/