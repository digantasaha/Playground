#include<stdio.h>
#include<math.h>
int main()
{long int n; scanf("%ld",&n);
  long int s=0,r,i=0;
  while(n!=0){
  r=n%10;
  s=s+r*pow(2,i);
  i++;
  n=n/10;}//printf("%d",s);
long int a[10],i1=0,c=0;
  while(s!=0){
  r=s%8;
  a[i1]=r;i1++;c++;s=s/8;}
 for(i1=c-1;i1>=0;i1--)printf("%ld",a[i1]);

}