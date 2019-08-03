#include<stdio.h>

int main()
{
  int n,a=1,b=2,i,c=0;
  scanf("%d",&n);
  if(n==1)
    printf("%d",1);
  else if(n==2)
    printf("%d",3);
  else
  {
  	for(i=3;i<=n;i++)
    {
      c=a+b;
      a=b;
      b=c;
    }
 	printf("%d",c);
  }
  //Type your code here
}