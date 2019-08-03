int main()
{
  int a[3],i,j,t;
  for(i=0;i<3;i++)
    scanf("%d",&a[i]);
  for(i=1;i<3;i++)
  { 
    for(j=i;j<3;j++)
      if(a[j]<a[j-1])
      {
        t=a[j];
        a[j]=a[j-1];
        a[j-1]=t;
      }
  }
  printf("%d",a[1]);
}