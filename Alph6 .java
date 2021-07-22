/*
     E
    D E
   C D E
  B C D E
 A B C D E    
 */
package test;
public class Alph6 
{
public static void main(String[] args) 
{
	int r=4;
for(int i=r;i>=0;i--)
{
	int alph=65;
	for(int k=0;k<i;k++)
	{
		System.out.print(" ");
	}
	
	for(int j=i;j<=r;j++)
	{
		System.out.print((char)(alph+j)+" ");
	}

	System.out.println();
}
}

}
