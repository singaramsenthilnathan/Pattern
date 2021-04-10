/*1
10
101
1010
10101
101010
1010101*/
public class Noo
{
public static void main(String[]args)
{
for(int i=1;i<=7;i++)
{
for(int j=1;j<=i;j++)
{
if(j==1 || j==3 || j==5 || j==7)
System.out.print(1);
if(j==2 || j==4 || j==6)
System.out.print(0);
//if(j==3)
//System.out.print(1);
//if(j==4)
//System.out.print(0);
//if(j==5)
//System.out.print(1);
//if(j==6)
//System.out.print(0);
//if(j==7)
//System.out.print(1);
}
System.out.println();
}
}
}

/*OUTPUT:
1
10
101
1010
10101
101010
1010101
*/