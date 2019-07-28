#include<stdio.h>
int main(){
int n;scanf("%d",&n);
int i,s,x=n,r;
while(x/10!=0){
s=0; n=x;
while(n!=0){
r=n%10;
s=s+r;
n=n/10;}
x=s;} printf("%d",x);
return 0;}


