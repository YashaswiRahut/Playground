#include<stdio.h>
#include<iostream>
using namespace std;

int main()
{
	long n,f=1;
  cin>>n;
  	for(long i=n;i>0;i--)
      f*=i;
  	cout<<f;
  return 0;
	//your code here
}