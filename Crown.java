public class Crown
{
public static void main(String[]args)
{
int ww=12,w=12,k=19,n=1;
for(int x=1;x<=4;x++)
{
for(int iji=x;iji>=1;iji--)
{
System.out.print(" ");
}
for(int y=x;y>=1;y--)
{
System.out.print("*");
}
for(int ijf=w;ijf>=1;ijf--)
{
System.out.print(" ");
}
w=w-3;
for(int fff=n;fff>=1;fff--)
{
System.out.print("*");
}
n=n+2;
for(int ief=ww;ief>=1;ief--)
{
System.out.print(" ");
}
ww=ww-3;
for(int yy=x;yy>=1;yy--)
{
System.out.print("*");
}
System.out.println();
}
for(int aaa=1;aaa<=5;aaa++)
{
System.out.print(" ");
}
for(int aa=1;aa<=19;aa++)
{
System.out.print("*");
}
System.out.println();

for(int i=1;i<=2;i++)
{
for(int ii=1;ii<=5;ii++)
{
System.out.print(" ");
}
if(i==2)
System.out.print(" ");
for(int j=1;j<=k;j++)
{
System.out.print("*");
}
k=k-2;
System.out.println();
}
}
}

/* OUTPUT:

 *            *            *
  **         ***         **
   ***      *****      ***
    ****   *******   ****
     *******************
     *******************
      *****************

*/