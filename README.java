# palindrome
class palin
{
public static void main(string args[])
{
int num=143;
int rev;
int s;
int rev2;
int s2;
int s3;
int s4;
rev=num%10;
s=rev*100;
rev2=num/10;
s2=rev2%10;
s3=rev2/10;
s4=s+s2+s3;
if(num==s4)
{
System.out.println("palindrome"+s3);
}
}
}
