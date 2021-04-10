public class For13 
{
public static void main(String[] args) 
{
// TODO Auto-generated method stub
int n=1;
int q=5;
for(int i=5;i>=1;i--)
{
for(int k=1;k<=i;k++)
{
System.out.print(" ");
}
for(int j=5;j>=i;j--)
{
	System.out.print("*"+" ");
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
System.out.print("*"+" ");
}
q=q-2;
l++;
System.out.println();
}
}
}





 