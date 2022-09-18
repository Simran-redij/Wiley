import java.util.StringTokenizer;

// Split string and String Tokenizer

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "Welcome to java programming";
		String[] words = data.split(" ");
		for(String word : words) {
			System.out.println(word);
		}
		
		StringTokenizer tokens = new StringTokenizer("Welcome to java programming"," ");
		while(tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		
		String complicatedString = "Welcome to some stuff $ which is *# do is @ youtube [ you doing ]";
		String[] meaningfulwords = complicatedString.trim().split("[!,?*$@#]+");
		for(String word : meaningfulwords) {
			System.out.println(word);
		}

	}

}
