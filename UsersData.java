public class UsersData { 
	 
	public static void main(String[] args) { 
		
		User anonimo = new User(); 
		anonimo.setUsername("a");
		anonimo.setPassword("b"); 
		 
		User yo = new User();  
		yo.setUsername("mi usuario");
		yo.setPassword("mi contraseña"); 
		
		Login.login(anonimo, yo.getUsername(), anonimo.getPassword());
		
		
	} 

}

