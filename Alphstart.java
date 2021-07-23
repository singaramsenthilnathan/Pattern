/*
A
B C
D E F
G H I J
K L M N O
P Q R S T U
V W X Y Z  [ \
 */
package test;
public class Alphstart 
{
public static void main(String[] args) 
{	int alph=65;
	for(int i=1;i<=7;i++)
	{
	
		for(int j=1;j<=i;j++)
		{
			System.out.print((char)alph+" ");
			alph++;
		}
		//alph++;
		System.out.println();
	}
		
	}

}
