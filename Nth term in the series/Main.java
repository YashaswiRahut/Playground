#include<stdio.h>

int main()
{
  int n;
  	scanf("%d",&n);
 if(n==1 || n==2)
    printf("%d",0);
  else
  {
  	if(n%2!=0)
    {
      printf("%d",n-1);
    }
  	else
    {
      printf("%d",n/2-1);
    }
  }
	return 0;// Type your code here
}