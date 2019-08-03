#include<stdio.h>
int main()
{
  int n,i,j,c=0,sum=0;
  scanf("%d",&n);
for(j=2;j<=n;j++)
{
  c=0;
  for(i=2;i<j;i++)
  {
    if(j%i==0)
      c++;
  }
  if(c==0)
     {
       // printf(" %d  ",j);
    	sum+=j;
     }
    
}
 printf("%d",sum);
return 0;
}