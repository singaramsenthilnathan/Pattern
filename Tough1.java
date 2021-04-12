public class Tough1
{
public static void main(String[]args)
{
	int n=0,b=0,e=0,d=0;
	int g=0,h=0,q=0,r=0;
	int bb=0,cc=0,ee=0,ff=0;
	
for(int i=1;i<=7;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
for(int a=n;a<=b;a++)
{
if(a==0)
break;
System.out.print(a);
}
n++;
b++;
for(int c=e;c<=d;c++)
{
if(c-1 == -1 || c-1 == 0 )
break;
System.out.print(c-1);
}
e++;
d++;
for(int f=g;f<=h;f++)
{
if(f-2 == -2 || f-2 == -1 || f-2 == 0  )
break;
System.out.print(f-2);
}
g++;
h++;
for(int p=q;p<=r;p++)
{
if(p-3 == -3 || p-3 == -2 || p-3 == -1 || p-3 == 0 )
break;
System.out.print(p-3);
}
q++;
r++;
for(int aa=bb;aa<=cc;aa++)
{
if(aa-4 == -4 || aa-4 == -3 || aa-4 == -2 || aa-4 == -1 || aa-4 == 0 )
break;
System.out.print(aa-4);
}
bb++;
cc++;
for(int dd=ee;dd<=ff;dd++)
{
if(dd-5 == -5||dd-5 == -4||dd-5 == -3 || dd-5 == -2 || dd-5 == 0 || dd-5 == -1)
break;
System.out.print(dd-5);
}
ee++;
ff++;
System.out.println();
}
}
}

/* OUTPUT:

1
121
12321
1234321
123454321
12345654321
1234567654321    */

