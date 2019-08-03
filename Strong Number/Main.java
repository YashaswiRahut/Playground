#include <stdio.h>
int main() {
  int n,f=1,sum=0,a;
  scanf("%d",&n);
  a=n;
  while(n!=0)
  {
    f=1;
  for(int i=1;i<=n%10;i++)
    f*=i;
   sum+=f;
   n/=10;
  }
 // printF("sum = %d\n",sum)
  if(a==sum)
    printf("Yes");
  else
    printf("No");
  //Type your code
	return 0;
}