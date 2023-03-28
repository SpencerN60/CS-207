import java.util.Scanner;
public class ValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please input an email: ");
		String email = stdin.next();
		int atSymbol = email.indexOf("@");
		String sub1 = email.substring(0,atSymbol);
		if (atSymbol == 0 || atSymbol == -1){
			System.out.println("Not an Email, the @ symbol has to be included somewhere other than the 0 index position");
		}
		else if (email.charAt(atSymbol + 1)=='.' || email.charAt(atSymbol - 1)=='.') {
			System.out.println("Not an Email, @ symbol cannot be next to a '.'");
		}
		else if (email.charAt(email.length()-1) == '.') {
			System.out.println("Not an Email, the last index cannot be a '.'");
		}
		else if (email.indexOf('.') == -1) {
			System.out.println("Not an Email, at least one '.' must be included");
		}
		else if (email.indexOf('@') == email.length()-1 || email.indexOf('.') == email.length()-1) {
			System.out.println("Not an Email, last character cannot be an '@'");
		}
		else {
			System.out.println("This is a valid Email");
		}
		

	}

}
