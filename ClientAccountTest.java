/*Ella Withington
 * Project 4
 * The JUnit class tests the ClientAccount class
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientAccountTest {

	ClientAccount client;
	
	@BeforeEach
	void doThis()
	{
		ArrayList<Account> accounts = new ArrayList<Account>();//list of accounts that client will have access to
		ClientAccount acc1 = new ClientAccount("client1","pwd",accounts);//accounts to go into accounts arraylist
		ClientAccount acc2 = new ClientAccount("client2","password",accounts);//accounts to go into accounts arraylist
		accounts.add(acc1);
		accounts.add(acc2);
		ClientAccount client = new ClientAccount("client","pass", accounts );
	}
	
	//tests the getUsername method
	@Test
	void testGetUsername() {
		assert(client.getUsername().equals("client1"));
	}
	
	//tests the verifyPassword method
	@Test
	void testVerifyPassword()
	{
		assert(client.verifyPassword("pass"));
	}
	
	//tests the setPassword method
	@Test
	void testSetPassword()
	{
		client.setPassword("67890");
		assert(client.verifyPassword("67890"));
	}
	
	//tests the toString method
	@Test
	void testToString()
	{
		assert(client.toString().equals("\nUsername: " + "client1"+ "\nClass Type: " + client.getClass()));
	}

}