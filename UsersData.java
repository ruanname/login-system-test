
public class UsersData { 
	 
	public static void main(String[] args) { 
		User anonimo = new User(); 
		anonimo.username = "anonimo"; 
		anonimo.password = "anonimato";  
		 
		User.login("anonimo", "anonimato"); 
	} 

}
