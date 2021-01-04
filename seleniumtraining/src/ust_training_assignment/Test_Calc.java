package ust_training_assignment;

import java.util.Scanner;

interface AdvanceCalculator {
int crosssum(int a);
boolean checkPrime(int a);
int factorial(int a);
}
class Calculator implements AdvanceCalculator{
@Override
public int crosssum(int a){
int sum=0;
while (a>0){
sum+=a%10;
a/=10;
}
return sum;
}
@Override
public boolean checkPrime(int a){
int count=0;boolean k=true;
for(int i=2;i< Math.sqrt((double)a);i++){
if(a%i==0) count++;
}
if(count==0) k=true;
else k=false;

return k;
}
@Override
public int factorial(int a){
int fact=1;
while(a>1){
fact*=a;
a--;
}
return fact;
}
}
class Test_Calc{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
Calculator c=new Calculator();
if(c.checkPrime(a)) System.out.println("Prime number");
else System.out.println("Not prime number");
System.out.println(c.factorial(a));
System.out.println(c.crosssum(c.factorial(a)));
}
}
