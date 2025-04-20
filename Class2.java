import java.util.Scanner;
public class Class2
{
public static void main(String[] args)
{


Scanner in=new Scanner(System.in);
int num=in.nextInt();
int target=in.nextInt();
System.out.println("count number of occurance");
int p;
int count=0;
while(num!=0)
{
    p=num%10;
    num=num/10;
    if(p==target)
    {
        count++;
    }
}
System.out.println(count);
}
}