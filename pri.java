import java.util.* ;
public class pri
{
public static void main(String args[])
{
int i,n;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number=" );
n=scan.nextInt();

for(i=2;i<=n;i++)
{
if(n%i==0)
{
break;
}
}
if(i==n)
{
System.out.println("The number is Prime.");
}
else
{
System.out.println("The number is not Prime.");
}
}
}