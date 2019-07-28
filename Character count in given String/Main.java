#include<stdio.h>
#include<string.h>
int main()
{char a[50];scanf("%s",a);
int l=strlen(a);	
  if(l>20)
  printf("Invalid Input");
  else{
  int i,c=0;
  for(i=0;i<l;i++){
  if(a[i]==a[i+1])
  c++;
  else{
  printf("%c%d",a[i],c+1);c=0;}}
  }
}