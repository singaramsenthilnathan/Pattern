/*
S
S I
S I N
S I N G 
S I N G A
S I N G A R
S I N G A R A
S I N G A R A M
 */
public class NamePattern 
{
public static void main(String[] args) 
{
String st ="SINGARAM SENTHILNATHAN";
char[]ch=st.toCharArray();

int k=1;//7
for(int i=0;i<ch.length;i++)
{

for(int j=0;j<k;j++)//7<7/
{
System.out.print(ch[j]+" ");
}
k++;
System.out.println();
}
}
}
/*
OUTPUT:
S 
S I 
S I N 
S I N G 
S I N G A 
S I N G A R 
S I N G A R A 
S I N G A R A M 
S I N G A R A M   
S I N G A R A M   S 
S I N G A R A M   S E 
S I N G A R A M   S E N 
S I N G A R A M   S E N T 
S I N G A R A M   S E N T H 
S I N G A R A M   S E N T H I 
S I N G A R A M   S E N T H I L 
S I N G A R A M   S E N T H I L N 
S I N G A R A M   S E N T H I L N A 
S I N G A R A M   S E N T H I L N A T 
S I N G A R A M   S E N T H I L N A T H 
S I N G A R A M   S E N T H I L N A T H A 
S I N G A R A M   S E N T H I L N A T H A N 

 */
*/
