// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
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
  printf("%d",k);
   return 0;
}