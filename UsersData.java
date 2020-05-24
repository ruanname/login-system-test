public class UsersData { 
	 
	public static void main(String[] args) { 
		
		User anonimo = new User(); 
		anonimo.setUsername("a");
		anonimo.setPassword("b"); 
		 
		User eu = new User();  
		eu.setUsername("meu usuario");
		eu.setPassword("minha senha"); 
		
		Login.login(anonimo, eu.getUsername(), anonimo.getPassword());
		
		
	} 

}
