/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package login;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class loginTest {
    
    public loginTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkfirstName method, of class login.
     */
    @Test
    public void testCheckfirstName() {
        System.out.println("checkfirstName");
        String firstname = "";
        String expResult = "";
        String result = login.checkfirstName(firstname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checklastName method, of class login.
     */
    @Test
    public void testChecklastName() {
        System.out.println("checklastName");
        String lastname = "";
        String expResult = "";
        String result = login.checklastName(lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkusername method, of class login.
     */
    @Test
    public void testCheckusername() {
        System.out.println("checkusername");
        String username = "kyle_1";
        boolean expResult = false;
        boolean result = login.checkusername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordcomplexity method, of class login.
     */
    @Test
    public void testCheckPasswordcomplexity() {
        System.out.println("checkPasswordcomplexity");
        String password = "Ch&&sec@ke99!";
        boolean expResult = false;
        boolean result = login.checkPasswordcomplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkcellphone method, of class login.
     */
    @Test
    public void testCheckcellphone() {
        System.out.println("checkcellphone");
        String phoneNumber = "+27838968976";
        boolean expResult = false;
        boolean result = login.checkcellphone(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String expResult = "";
        String result = login.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String entereduserName = "";
        String enteredPassword = "";
        String storeduserName = "";
        String storedPassword = "";
        boolean expResult = false;
        boolean result = login.loginUser(entereduserName, enteredPassword, storeduserName, storedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginStatus method, of class login.
     */
    @Test
    public void testLoginStatus() {
        System.out.println("loginStatus");
        String username = "";
        String password = "";
        String expResult = "";
        String result = login.loginStatus(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
