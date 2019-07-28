#include<stdio.h>
#include<math.h>
int main()
{long int n;scanf("%ld",&n);
  long int s=0,r,i=0;
  while(n!=0){
  r=n%10;
  s=s+r* pow(2,i);i++;
  n=n/10;}
printf("%ld",s);  
 return 0;
}
