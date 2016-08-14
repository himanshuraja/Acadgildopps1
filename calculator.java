import java.util.Scanner;
public class calculator{
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
Maths maths=new Maths();
double answer=0;
double a,b;
char operator;
boolean done=false;
while(!done){
System.out.println("Please enter your number + opreartor +second number");
a=sc.nextDouble();
operator =sc.next().charAt(0);
b=sc.nextDouble();
switch(operator){
case '+':
answer =maths.add(a,b);
break;
case '-':
answer=maths.subtract(a,b);
break;
case '*':
answer=maths.multiply(a,b);
break;
case '/':
answer=maths.divide(a,b);
break;}
System.out.println(answer);
}
sc.close();

}}
 class Maths {

    double add(double a, double b) {
        double answer = a+b;
        return answer;          
    }

    double subtract(double a, double b) {
        double answer = a-b;
        return answer;          
    }

    double multiply(double a, double b) {
        double answer = a*b;
        return answer;          
    }

    double divide(double a, double b) {
        double answer = a/b;
        return answer;          
    }

    double power(double a, double b){
        double answer =a;

        for (int x=2; x<=b; x++){
            answer *= a;
        }

        return answer;
    }

}
