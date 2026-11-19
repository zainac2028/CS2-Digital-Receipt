import java.util.Scanner;

public class Main {
public static void main(String [] args) {

Scanner input = new Scanner(System.in);

String highschoolName = "BWL"; 
double dieco = 1.25;
double gum = 2.50;
double prake = 5.00;
double proteiny = 4.00;

int orderNumber = (int)(Math.random() * 100) + 1;

int cokesOrdered = (int)(Math.random() * 3);
int barsOrdered = (int)(Math.random() * 3);
int shakesOrdered = (int)(Math.random() * 3);
int gumsOrdered = (int)(Math.random() * 3);

double taxRate = 0.04;

double subtotal = (cokesOrdered * dieco) + (barsOrdered * proteiny) + (shakesOrdered * prake) + (gumsOrdered * gum);

double totalTax = subtotal * taxRate;

double total = subtotal + totalTax;

System.out.print("Enter number of Diet Cokes: ");
cokesOrdered = Integer.parseInt(input.nextLine());

System.out.print("Enter number of Protein Bars: ");
barsOrdered = Integer.parseInt(input.nextLine());

System.out.print("Enter number of Protein Shakes: ");
shakesOrdered = Integer.parseInt(input.nextLine());

System.out.print("Enter number of Extra: ");
gumsOrdered = Integer.parseInt(input.nextLine());

  System.out.print("Enter your high school name: ");
  highschoolName = input.nextLine();

      System.out.println("Order Number: " + orderNumber);

    System.out.println("--------------------------------------");

    System.out.printf("%d Diet Cokes       $%.2f%n", cokesOrdered, cokesOrdered * dieco);
    System.out.printf("%d Protein Bars      $%.2f%n", barsOrdered, barsOrdered * proteiny);
    System.out.printf("%d Protein Shakes     $%.2f%n", shakesOrdered, shakesOrdered * prake);
    System.out.printf("%d Extra: PI's   $%.2f%n", gumsOrdered, gumsOrdered * gum);

    System.out.println("--------------------------------------");

    System.out.printf("Subtotal:      $%.2f%n", subtotal);
    System.out.printf("Tax (4%%):      $%.2f%n", totalTax);
    System.out.printf("Total:         $%.2f%n", total);

    System.out.println("**************************************");



input.close();

  }
}
