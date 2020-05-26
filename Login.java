public class Login { 
	
	public static boolean login(User user,String usernameSet, String passwordSet ) {   
			
			if (user.getUsername() == usernameSet && user.getPassword() == passwordSet) {
				System.out.println("Entra coño");
				return true;
			} else {
				System.out.println("fuera");
				return false; 
			} 
			
		} 
	
	public static boolean logout(User user) {
			
			return false;
			
		}  

}
