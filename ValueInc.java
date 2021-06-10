/*
1 6 10 13 15
2 7 11 14
3 8 12
4 9
5
*/
public class ValueInc 
{
public static void main(String[] args) 
{
for(int r=1;r<=5;r++)
{
for(int c=5;c>=r;c--)
{
if(c==5)
System.out.print(r+" ");
if(c==4)
System.out.print(r+5+" ");
if(c==3)
System.out.print(r+9+" ");
if(c==2)
System.out.print(r+12+" ");
if(c==1)
System.out.print(r+14+" ");
}
System.out.println();
}
}
}
