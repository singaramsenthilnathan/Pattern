public class Daimond 
{
public static void main(String[] args) 
{
// TODO Auto-generated method stub
int n=1;
int q=5;
int y=4;
int z=2;
int p=5;
for(int i=5;i>=1;i--)
{
for(int k=1;k<=i;k++)
{
System.out.print(" ");
}
for(int j=5;j>=i;j--)
{
	System.out.print("* ");
}
for(int x=1;x<=y;x++)
{
	System.out.print(" "+" ");
}
y=y-2;
for(int j=5;j>=i;j--)
{
	System.out.print("* ");
}
i=i-n;

	System.out.println();
}
for(int l=3;l<=5;l++)
{
for(int r=1;r<=l;r++)
{
System.out.print(" ");
}
for(int m=3;m<=q;m++)
{
System.out.print("* ");
}
q=q-2;
l++;
//System.out.println();

for(int x=1;x<=z;x++)
{
System.out.print(" "+" ");
}
z=2*z;
for(int s=3;s<=p;s++)
{
System.out.print("* ");
}
p=p-2;
//z=z+1;
System.out.println();
}
}
}

/* OUTPUT:

c:\java>javac Daimond.java

c:\java>java Daimond
     *         *
   * * *     * * *
 * * * * * * * * * *
   * * *     * * *
     *         *

*/
 