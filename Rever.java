import java.util.*;
public class subset
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n1,m1,t=0;
n1=sc.nextInt();
m1=sc.nextInt();
int a[]=new int[n1];
int b[]=new int[m1];
for(int i=0;i<n1;i++)
a[i]=sc.nextInt();
for(int j=0;j<m1;j++)
b[j]=sc.nextInt();

for(int i=0;i<b.length;i++)
{
for(int j=0;j<a.length;j++)
{
if(b[i]==a[j])
t++;
}
}
if(t==b.length)
System.out.println(" array b is a subset of array a");
else
System.out.println("not");
}
}
