public class Login { 
	
	public static boolean login(User user,String usernameSet, String passwordSet ) {   
			
			if (user.getUsername() == usernameSet && user.getPassword() == passwordSet) {
				System.out.println("Acesso Concedido");
				return true;
			} else {
				System.out.println("Acesso Negado");
				return false; 
			} 
			
		} 
	
	public static boolean logout(User user) {
			
			return false;
			
		}  

}
