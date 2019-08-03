#include <stdio.h>
int main() {
  int n,sum=0;
  scanf("%d",&n);
  sum=n%10;
  while(n!=0)
  {
    if(n/10==0)
      break;
   	n/=10;
  }
  printf("%d",sum+n%10);
	//Type your code
	return 0;
}