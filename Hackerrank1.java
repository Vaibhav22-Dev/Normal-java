import java.util.*;
class Hackerrank1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();

while(t-->0) {
	int n = sc.nextInt();
if(n%2!=0)
{
	System.out.println("Weird");
}
else if(n%2==0 &&  (n==2 || n==4))
{
	System.out.println("Not Weird");
}
else if(n%2==0 &&   (n==6||n==8||n==10||n==12||n==14||n==16||n==18||n==20) )
{
	System.out.println("Weird");
}

else
	System.out.println("Not Weird");
}
}
}