import java.util.*;
public class minimum 
{
public static void main(String ar[])throws Exception
{
    int r,i,k;
    int s[]=new int[100];
Scanner s1=new Scanner(System.in);
minimum m1=new minimum();
String a=new String();
a=s1.next();
k=s1.nextInt();
int n=Integer.parseInt(a);
i=0;
while(n>0)
{
r=n%10;
s[i++]=r;
n/=10;
}
m1.sort(s,k,i);
}
public void sort(int l[],int m,int g)
{
    int t;
for(int i=0;i<g-1;i++)
{
for(int j=i+1;j<g;j++)
{
if(l[i]>l[j])
{
t=l[i];
l[i]=l[j];
l[j]=t;
}
}
}
for(int i=0;i<m;i++)
    System.out.print(l[i]);
}
}
