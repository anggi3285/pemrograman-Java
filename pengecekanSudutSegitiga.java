import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("sudut 1 : ");
	    int sudut1 = input.nextInt();
	    System.out.print("sudut 2 : ");
	    int sudut2 = input.nextInt();
	    System.out.print("sudut 3 : ");
	    int sudut3 = input.nextInt();
	    
	    int rata = sudut1+sudut2+sudut3;
	    
	    if (rata != 180 ) {
	        System.out.print("ini tidak bisa membangun segitiga");
	    }else {
	        System.out.print("ini bisa membangun segitiga");
	    }
	}
}
