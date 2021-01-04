package ust_training_assignment;
import java.util.Scanner;

abstract class Shape{
abstract void area();
abstract void perimeter();
}
class Square extends Shape{
int length;
Square(int len){
this.length=len;
}
void area() {
double num=length * length;
System.out.print("Area : ");
System.out.format("%.2f", num);
}
void perimeter(){
double num= 4*length;
System.out.print("Perimeter : ");
System.out.format("%.2f", num);
System.out.println();
}
}
class Rectangle extends Shape{
int length,width;
Rectangle(int len,int wid){
this.length=len;
this.width=wid;
}
void area() {
double num=length * width;
System.out.print("Area : ");
System.out.format("%.2f", num);
}
void perimeter(){
double num=2*(length+width);
System.out.print("Perimeter : ");
System.out.format("%.2f", num);
System.out.println();
}
}
class Circle extends Shape{
int radius;
Circle(int rad){
this.radius=rad;
}
void area() {
double num=Math.PI;
System.out.print("Area : ");
System.out.format("%.2f", num);
}
void perimeter(){
double num=2*Math.PI;
System.out.print("Circumference : ");
System.out.format("%.2f", num);
System.out.println();
}

}
class Triangle extends Shape{
int s1,s2,s3;
Triangle(int s1,int s2,int s3){
this.s1=s1;
this.s2=s2;
this.s3=s3;;
}
void area() {
int s=(s1+s2+s3)/2;
double num=Math.sqrt((s-s1)*(s-s2)*(s-s3));
System.out.print("Area : ");
System.out.format("%.2f", num);
}
void perimeter(){
double num=s1+s2+s3;
System.out.print("Perimeter : ");
System.out.format("%.2f", num);
System.out.println();
}
}
class TriangleClass{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Shape s;
char ch=sc.next().charAt(0);
if(ch=='S'){
int l=sc.nextInt();
s=new Square(l);
s.perimeter();
s.area();
}
else if(ch=='R'){
int l=sc.nextInt();
int b=sc.nextInt();
s=new Rectangle(l,b);
s.perimeter();
s.area();
}
else if(ch=='C'){
int r=sc.nextInt();
s=new Circle(r);
s.perimeter();
s.area();
}
else{
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();
s=new Triangle(s1,s2,s3);
s.perimeter();
s.area();
}
}
}
