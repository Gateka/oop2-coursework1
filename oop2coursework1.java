package oop2coursework1;
import java.util.Scanner;
public class oop2coursework1{
  public static void main(String[] args){
    Scanner arm = new Scanner(System.in);
    System.out.println("Enter Student's name: ");
    String nam = arm.next();
    int a=0,r=0,m=0,e=0,l=0,n=0,av=0;
    for(;a <= 0 || a > 100;){
    if(a == 0){
    System.out.println("Enter First Courseunit name : ");
      nam = arm.next();
    }
      System.out.print("Enter First Courseunit result: ");
      a = arm.nextInt();
    }
