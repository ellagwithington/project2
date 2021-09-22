/*Lily Davis
 * Project 4
 * The JUnit class tests the AdminAccount class
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminAccountTest {

	AdminAccount admin;//a test case account 
	
	@BeforeEach
	void doThis()
	{
		ArrayList<Account> accounts = new ArrayList<Account>();//list of accounts that admin will have access to
		AdminAccount acc1 = new AdminAccount("ldavis","123456",accounts);//accounts to go into accounts
		AdminAccount acc2 = new AdminAccount("Mr.chocolate","password",accounts);//accounts to go into accounts
		accounts.add(acc1);
		accounts.add(acc2);
		admin = new AdminAccount("admin1","12345", accounts );
	}
	
	//tests the getUsername method
	@Test
	void testGetUsername() {
		assert(admin.getUsername().equals("admin1"):"GetUserName failed");
	}
	
	//tests the verifyPassword method
	@Test
	void testVerifyPassword()
	{
		assert(admin.verifyPassword("12345"): "VerifyPassword Failed");
	}
	
	//tests the setPassword method
	@Test
	void testSetPassword()
	{
		admin.setPassword("67890");
		assert(admin.verifyPassword("67890"): "SetPassword Failed");
	}
	
	//tests the toString method
	@Test
	void testToString()
	{
		assert(admin.toString().equals("\nUsername: " + "admin1"+ "\nClass Type: " + admin.getClass()):"ToString failed");
	}

}
