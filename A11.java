/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G  */

public class A11
{
public static void main(String[]args)
{
int alphabet = 65;
for(int i=1;i<=7;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print((char) alphabet + " ");
}
alphabet++;
System.out.println();
}
}
}

/* OUTPUT:

A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G   */