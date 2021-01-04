package ust_training_assignment;
import java.util.*;
class Event {
protected String name;
protected String detail;
protected String ownername;
Event(String name,String detail,String ownername){
this.name=name;
this.detail=detail;
this.ownername=ownername;
}
public double projectedRevenue(){
return 0.0;
}
}

class Exhibition extends Event{
int noOfStall;
Exhibition(String name,String detail,String ownername,int noOfStall){
super(name,detail,ownername);
this.noOfStall=noOfStall;
}
public double projectedRevenue(){
return noOfStall*10000;
}
}

class StageEvent extends Event{
int noOfShows;
int noOfSeatsPerShow;
StageEvent(String name,String detail,String ownername,int noOfShows,int noOfSeatsPerShow){
super(name,detail,ownername);
this.noOfShows=noOfShows;
this.noOfSeatsPerShow=noOfSeatsPerShow;
}
public double projectedRevenue(){
return noOfSeatsPerShow*50;
}
}

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
String c=sc.nextLine();
Event ev;
System.out.println("please enter the option 1 or 2:");
int cases=sc.nextInt();
if(cases==1){
int noofstalls=sc.nextInt();
ev=new Exhibition(a,b,c,noofstalls);
System.out.println(ev.projectedRevenue());
}
else{
int noofshows=sc.nextInt();
int noofseatspershow=sc.nextInt();
ev=new StageEvent(a,b,c,noofshows,noofseatspershow);
System.out.println(ev.projectedRevenue());
}

}
}