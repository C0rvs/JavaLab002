import java.util.Scanner;
public class Answers2 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		char answer = 'y';
		
		while(answer == 'y') {
		System.out.println("Enter file size (MB): ");
		String mbSize = scan.next();
		System.out.println("Enter donwload speed (MB/sec): ");
		String speed = scan.next();
		
		float floatFileSize = Float.parseFloat(mbSize);
		float floatSpeed = Float.parseFloat(speed);
		
		floatFileSize /= floatSpeed; 
		
		int sec = (int) floatFileSize % 60;
		int min = (int)(floatFileSize/60) % 60;
		int hours =(int) floatFileSize/3600; 
		
		System.out.printf("This download will take approximately %d hours %d mins %d seconds ", hours, min, sec);
		
		do {
			System.out.println("Continue? (y/n)" );
			answer = scan.next().toLowerCase().charAt(0); 
		  	
		}while(Character.toLowerCase(answer) != 'y' && Character.toLowerCase(answer) != 'n');
		
		
		}
		
		
		
	}
}
