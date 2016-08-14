import java.util.Random;
import java.util.Scanner;
class random{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter your min range :" );
int min=sc.nextInt();
System.out.println("enter your maximum range :");
int max=sc.nextInt();
Random rand=new Random();
int ra=rand.nextInt((max-min)+1) + min;
System.out.println(ra);












}}
