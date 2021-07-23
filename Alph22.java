/*
G
G F
G F E
G F E D
G F E D C
G F E D C B
G F E D C B A
 */

package test;
public class Alph22 
{
public static void main(String[] args) 
{
	
for(int i=1;i<=7;i++)
{
	int alph=65;
	for(int j=1;j<=i;j++)
	{
		System.out.print((char)(alph+6)  +" ");
		alph--;
	}
	System.out.println();
}

}
}
