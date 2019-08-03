#include <stdio.h>
#include<iostream>
#include<math.h>
using namespace std;

int main()
{

  int a,b;
  cin>>a>>b;
  if(b<0)
    cout<<"Wrong input";
  else
    cout<<pow(a,b);//Your code here       
    return 0;
}