import java.util.Scanner;
class CPU{
 int price;
 class Processor{
 int no_of_cores;
 String manufacter;
 void addProcessor(Scanner sc){
 System.out.print("Enter no.of cores in processor:");
 no_of_cores = sc.nextInt();
 sc.nextLine();
 System.out.print("Enter the manufacter name:");
 manufacter = sc.nextLine();
 }
 void display()
 {
 System.out.println("Number of cores in Processor:"+no_of_cores);
 System.out.println("Processor manufacter name:"+manufacter);
 }
 }
 static class RAM{
 int memory;
 String manufacter;
 void addRAM(Scanner sc){
 System.out.print("Enter memory size of RAM:");
 memory = sc.nextInt();
 sc.nextLine();
 System.out.print("Enter the manufacter name:");
 manufacter = sc.nextLine();
 }
 void display()
 {
 System.out.println("memory size of RAM:"+memory+"GB");
 System.out.println("RAM manufacter name:"+manufacter);
 }
 }
 void showCPU(int price){
 System.out.println("\nCPU price:"+price);
 }
}
public class CPU1{
 public static void main(String a[]){
 Scanner sc=new Scanner(System.in);
 System.out.print("enter the price of cpu:");
 int price=sc.nextInt();
 CPU c = new CPU();
 CPU.Processor p = c.new Processor();
 CPU.RAM r = new CPU.RAM();
 p.addProcessor(sc);
 r.addRAM(sc);
 c.showCPU(price);
 p.display();
 r.display();
 }
}
