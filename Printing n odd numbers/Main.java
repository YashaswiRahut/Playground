#include <stdio.h>
int main() {
	int n;
      scanf("%d",&n);
    for(int i=1,c=1;c<=n;i++)
     if(i%2==1)
     {
       c++;
       printf("%d\n",i);//Type your code
     }
	return 0;
}