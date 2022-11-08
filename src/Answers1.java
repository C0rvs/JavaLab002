import java.util.Scanner;
public class Answers1 {
	  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("WELCOME TO THE INVOICE TOTAL CALCULATOR");
		    char answer = 'y';
		    int numberOfInvoice = 0; 
		    float averageOfInvoice = 0.0f; 
		    float averageDiscount = 0.0f; 
		    
		    
		    while(Character.toLowerCase(answer) == 'y') {
		    System.out.println("Enter subtotal: ");
		    String stringAmount = scanner.next();
		    
		    
		    System.out.println("Discount percent: ");
		    String stringDiscount = scanner.next();
		    
		    float amount = Float.parseFloat(stringAmount);
		    float discount = Float.parseFloat(stringDiscount);
		    float discountAmount = amount * discount; 
		    System.out.println("Discount amount: " + discountAmount);
		    
		    float total = amount - discountAmount;
		    System.out.println("Invoice total: " + total);
		    
		    numberOfInvoice++; 
		    averageOfInvoice += total;
		    averageDiscount += discountAmount; 
		    
		    do {
		    System.out.println("Continue? (y/n): ");
		    answer = scanner.next().charAt(0);
		    }while(Character.toLowerCase(answer) != 'y' && Character.toLowerCase(answer) != 'n');
		    
		    answer = Character.toLowerCase(answer);
		    }
		    
		    averageOfInvoice /= numberOfInvoice; 
		    averageDiscount /= numberOfInvoice; 
		    System.out.println("Number of Invoices: " + numberOfInvoice);
		    System.out.println("Average invoice: " + averageOfInvoice);
		    System.out.println("Average discount: " + averageDiscount);
		    
		  }

}
