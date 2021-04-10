public class Dia
{
public static void main(String[]args)
{
int n=1;
int q=5;
int y=4;
int z=2;
int p=5;

for(int l=3;l<=5;l++)
{
for(int r=1;r<=l;r++)
{
System.out.print(" ");
}
for(int m=3;m<=q;m++)
{
System.out.print("*");
}
q=q-2;
//l++;
//System.out.println();

for(int x=1;x<=z;x++)
{
System.out.print(" "+" ");
}
//z=2*z;
for(int s=3;s<=p;s++)
{
System.out.print("*");
}
p=p-2;
z=z+1;
System.out.println();
}
}
}