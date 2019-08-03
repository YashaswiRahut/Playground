#include<stdio.h>
int main()
{
  int a,b,i,k=0;
  scanf("%d%d",&a,&b);
  int c = (a>b)?b:a;// Enter your code here 
  for(i=1;i<=c;i++)
  {
    if(a%i==0 && b%i==0)
      k=i;
  }
  printf("%d",(a*b)/k);//Type your code here
  return 0;
}