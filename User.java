
public class User { 
	String username; 
	String password; 
	
	
	public static boolean login(String usernameSet, String passwordSet ) {  
		
		if (username == usernameSet && password == passwordSet) {
			System.out.println("Acesso Concedido"); 
			return true;
		} else {
			System.out.println("Acesso Negado"); 
			return false; 
		}
	} 

}
