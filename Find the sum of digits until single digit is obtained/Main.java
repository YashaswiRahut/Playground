int main()
{
  int a,s=0;
  scanf("%d",&a);
  do 
  {
   while(a!=0) 
   {
    s+=a%10;
    a/=10;
   }
   if(s>10)
   {
     a=s;
     s=0;
   }
  }while(a>10);
  printf("%d",s);
}