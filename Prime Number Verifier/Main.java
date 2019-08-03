#include <stdio.h>
// Main function
int main()
{
  int n,i,c=0;
  scanf("%d",&n);
  if(n!=0)
  {
  for(i=2;i<n/2;i++)
  {
    if(n%i==0)
      c++;
  }
  if(c==0)
    printf("prime");
  else
    printf("composite");// Enter your code here 
  }
  else
    printf("neither");
   return 0;
}