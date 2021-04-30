public class NumPat 
{
public static void main(String[] args) 
{	
int n=1,p=2,c=7,q=6,r=4;
for(int i=1;i<=5;i++)
{
for(int j=i;j<=n;j++)
{
System.out.print(j);
}
n=n+2;
if(i>1)
{
for(int k=p;k>=i;k--)
{
System.out.print(k);
}
p=p+2;
}
System.out.println();
}
for(int a=4;a>=1;a--)
{
for(int b=a;b<=c;b++)
{
System.out.print(b);
}
c=c-2;
for(int d=q;d>=r;d--)
{
System.out.print(d);
}
r--;
q=q-2;
System.out.println();
}
}
}
/*OUTPUT:
1
232
34543
4567654
567898765
4567654
34543
232
1
*/
