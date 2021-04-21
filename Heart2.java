public class Heart2
{
public static void main(String[]args)
{
int n=9;
int u=1;
System.out.print(" "+" "+" ");
System.out.print(" "+" "+" ");
for(int e=1;e<=2;e++)
{
System.out.print(" "+"*"+" ");
}
System.out.print(" "+" "+" ");
System.out.print(" "+" "+" ");
System.out.print(" "+" "+" ");
for(int f=1;f<=2;f++)
{
System.out.print(" "+"*"+" ");
}
System.out.println();
System.out.print(" "+" "+" ");
for(int c=1;c<=4;c++)
{
System.out.print(" "+"*"+" ");
}
System.out.print(" "+" "+" ");
for(int d=1;d<=4;d++)
{
System.out.print(" "+"*"+" ");
}
System.out.println();
for(int a=1;a<=5;a++)
{
for(int b=1;b<=u;b++)
{
System.out.print(" "+" "+" ");
}
u++;
for(int i=n;i>=1;i--)
{
System.out.print(" "+"*"+" ");
}
n=n-2;

System.out.println();
}
}
}

/* OUTPUT:

       *  *           *  *
    *  *  *  *     *  *  *  *
    *  *  *  *  *  *  *  *  *
       *  *  *  *  *  *  *
          *  *  *  *  *
             *  *  *
                *
				
*/

