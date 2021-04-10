/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
*/
public class Diagonal
{
public static void main(String[]args)
{
	int y=6;
for(int i=0;i<=6;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(j);
}
for(int k=1;k<=y;k++)
{
System.out.print("0");
}
y--;
System.out.println();

}

}


}
/*OUTPUT:
0000000
0100000
0120000
0123000
0123400
0123450
0123456
*/