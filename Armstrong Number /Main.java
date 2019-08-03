#include <stdio.h>
#include <math.h>
int main() {
	int n,c=0,sum=0,a,b;
  	scanf("%d",&n);
  	a=n;
  	b=n;
  while(n!=0)
    {
      c++;
      n/=10;
    }//Type your code
  	while(a!=0)
    {
      sum+=(pow(a%10,c));
      a/=10;
    }
  //printf("%dsum = %d\n",sum);
  if(b==sum)
  	printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}