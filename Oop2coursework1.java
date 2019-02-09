package oop2coursework1;
import java.util.Scanner;
public class Oop2coursework1 {
  public static void main(String[] args) {
      int OOP1, OOP2, MobileProgramming, ComputerNetwork, CISCO, Webdesign;
        Scanner arm = new Scanner(System.in);
        System.out.println("Enter Student's name: ");
        String stname = arm.next();
        for(OOP1 = 0;OOP1 <= 0 || OOP1 > 100;){
        System.out.print("Enter result of OOP1: ");
        OOP1 = arm.nextInt();
        System.out.println("OOP1 result: "+ OOP1);
        System.out.println("");}
        
        for(OOP2 = 0;OOP2 <= 0 || OOP2 > 100;){
        System.out.print("Enter result of OOP2: ");
        OOP2 = arm.nextInt();
        System.out.println("OOP2 result: "+ OOP2);
        System.out.println("");}
        
        for(MobileProgramming = 0;MobileProgramming <= 0 || MobileProgramming > 100;){
        System.out.print("Enter result of MobileProgramming: ");
        MobileProgramming = arm.nextInt();
        System.out.println("OOP1 result: "+ MobileProgramming);
        System.out.println("");}
        
        for(ComputerNetwork = 0;ComputerNetwork <= 0 || ComputerNetwork > 100;){
        System.out.print("Enter result of ComputerNetwork: ");
        ComputerNetwork = arm.nextInt();
        System.out.println("OOP2 result: "+ ComputerNetwork);
        System.out.println("");}
        
        for(CISCO = 0;CISCO <= 0 || CISCO > 100;){
        System.out.print("Enter result of CISCO: ");
        CISCO = arm.nextInt();
        System.out.println("OOP2 result: "+ CISCO);
        System.out.println("");}
        
        for(Webdesign = 0;Webdesign <= 0 || Webdesign > 100;){
        System.out.print("Enter result of Webdesign: ");
        Webdesign = arm.nextInt();
        System.out.println("OOP2 result: "+ Webdesign);
        System.out.println("");}
        
        int total = OOP1 + OOP2 + MobileProgramming + ComputerNetwork + CISCO + Webdesign;
        double x;
        float grade;
        
        System.out.println("x is: ");
        x = arm.nextDouble();
        
        grade = (float) ((total * 100) / x);
        System.out.println("Grade is: "+grade);
       
    }
    
}