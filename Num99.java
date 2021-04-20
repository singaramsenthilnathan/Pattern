/*
999999999999999999  //0
88888888  88888888 //2   // 
7777777    7777777//4
55555        55555//8
4444          4444//10
333            333//12
22              22//14
1                1//16
*/
public class Num99
{
public static void main(String[]args)
{int n=2;
for(int i=9;i>=1;i--)
{
if(i==6)
continue;
for(int j=i;j>=1;j--)
{
System.out.print(i);
}
if(i!=9)
{
for(int l=n;l>=1;l--)
{
System.out.print("$");
}
if(n<8)
{
n=n*2;
}
else if(n<16)
{
n=n+2;
}
}
for(int k=i;k>=1;k--)
{
System.out.print(i);
}
System.out.println();
}
}
}
/*OUTPUT:
999999999999999999
88888888$$88888888
7777777$$$$7777777
55555$$$$$$$$55555
4444$$$$$$$$$$4444
333$$$$$$$$$$$$333
22$$$$$$$$$$$$$$22
1$$$$$$$$$$$$$$$$1
*/
