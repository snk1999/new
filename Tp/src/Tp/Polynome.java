package Tp;

public class Polynome {
	private double a,b,c;
	
public Polynome (double x,double y,double z) {
	this.a=x;
	this.b=y;
	this.c=z;
	 
 }
public Polynome() {
	this.a=0;
	this.b=0;
	this.c=0;
}
public void Resoudre () {
	
	double sol1,sol2,d;
	
d= Math.pow(b , 2.0)+(4*a*c);
if( d>0){
    sol1=(-b - Math.sqrt(d))/(2*a) ;
    sol2=(-b + Math.sqrt(d))/(2*a) ;
System.out.println("solution 1 is " + sol1);
System.out.println("solution 2 is " + sol2);
}else{if(d==0){
    sol1=(-b)/(2*a) ; System.out.println("solution  is " + sol1);
    }else{System.out.println("there is no  solution ");
}
}
}
public void Derive() {
	if (a == 0) {
        if (b == 0) {
            System.out.println("P'(x)="+ 0);
        }else{   System.out.println("P'(x)="+ b);
        System.out.println("solution is  "+ (-c/b));}
    }else{ System.out.println("P'(x)="+2*a+"x+"+ b);
}}
}
