#include<stdio.h>
int main()
{char str[50];
  fgets(str,50,stdin);
  int i=0,c=0;
  while(str[i]!='\0'){
  c++;i++;}
  printf("%d",c);
  
  
  
  
  
  return 0;
}