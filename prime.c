#include<stdio.h>
int main()
{
int s,e,i,flag=0,x;
printf("enter the starting and ending interval");
scanf("%d%d",&s,&e);
for(i=s;i<=e;i++)
{
  for(x=2;x<i;x++)
{
if(i%x==0)
{
flag=1;
}
}
if(flag==0)
printf("%d",&i);
}

printf("the above is the prime number series");
return 0;
}prime.c
