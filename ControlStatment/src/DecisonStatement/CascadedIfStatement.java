package DecisonStatement;
import java.util.Scanner;
public class CascadedIfStatement {
public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
		    int x=s.nextInt();
		    int	y=s.nextInt();
		    int	z=s.nextInt();
			if(x>y && x>z){
				System.out.println("The greater number is:"+x);
			}
			else if(y>x && y>z) {
				System.out.println("The greater number is:"+y);
			}
			else{
				System.out.println("The greater number is:"+z);
			}
	}

}
