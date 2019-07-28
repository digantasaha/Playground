#include<stdio.h>
#include<string.h>
int main()
{char a[50];fgets(a,50,stdin);
  int i=0,c=0;
  while(a[i]!='\0'){
  if(a[i]==' ')
  c++;
  i++;}
  printf("%d",c+1);
  
  
  
  
}