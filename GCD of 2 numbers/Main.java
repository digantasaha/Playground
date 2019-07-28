// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{int i,c,a,b;scanf("%d%d",&a,&b);
  if(a<b) c=a; else c=b;
  for(i=c;i>=1;i--){
  if(a%i==0 && b%i==0)
  break;}
  printf("%d",i);
   return 0;
}