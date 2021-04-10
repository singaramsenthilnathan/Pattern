/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15*/
public class Numb7
{
	
public static void main(String[]args)
{
for(int j=1;j<=5;j++)
{
for(int i=1;i<=j;i++)
{
//System.out.print(j);
if(i==1)
System.out.print(j);
if(i==2)
System.out.print(j+4);
if(i==3)
System.out.print(j+7);
if(i==4)
System.out.print(j+9);
if(i==5)
System.out.print(j+10);
}

for(int k=4;k>=j;k--)
{
System.out.print("");
}
System.out.println();
}
}
}
/*OUTPUT:
1
26
3710
481113
59121415
*/
