/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class login {
 
    private String storeduserName ;
    private String storedPassword ;
    static String savedUsername;
    static String savedPassword;
    
    public static String checkfirstName(String firstname){
        if (firstname== null || firstname.isEmpty()){
            System.out.println("Invalid firstname");
            return null;
        }
        return firstname;
    }
    public static String checklastName(String lastname){
        if (lastname == null || lastname.isEmpty()){
            System.out.println("Invalid lastname");
            return null;
        }
        return lastname;
    }
    
    public static boolean checkusername(String username){
        if(username.contains("_")&& username.length() <= 5){
            System.out.println("Username successfully captured");
            return true;
        }else{
            System.out.println("Username is not correctly formatted;"
                    + " Please ensure that your username contains an underscore "
                    + "and is no more than five characters in length.");
            return false;
        }
    }
    
    public  static boolean checkPasswordcomplexity(String password){
        boolean hasUpper=false, hasLower=false, hasDigit=false, hasSpecial = false;
        if(password == null || password.length()<8){
            System.out.println("Password is not correctly formatted; Please ensure that the password contains atleast a 8 characters, a capital letter,a number,and a special character.");
            return false;
        }
        
        for (char c : password.toCharArray()){
            if (Character.isUpperCase(c)) hasUpper = true;
            else if(Character.isLowerCase(c))hasLower = true;
            else if(Character.isDigit(c)) hasDigit = true;
            else hasSpecial = true;
        }
        System.out.println("Password successfully added");
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
    
    
    public static boolean checkcellphone(String phoneNumber){
        String pattern = "\\+27\\d{9}";
        
        if (phoneNumber.matches(pattern)){
            System.out.println("Cellphone number successfully added");
            return true;
        }else{
            System.out.println("Cellphone number incorrectly formatted or does not contain international code ");
            return false;
        }
    }
     
    public static String registerUser(String username,String password){
        boolean validUsername = checkusername(username);
        boolean validPassword = checkPasswordcomplexity(password);
        
        if (validUsername && validPassword){
            return"Registration succesful";
        }else{
           return "Login failed";         
        }
    }
    
    public static boolean loginUser(String entereduserName, String enteredPassword,
                                     String storeduserName, String storedPassword){
    
        return enteredPassword.equals(storedPassword) &&
                entereduserName.equals(storeduserName);
    }
    public static String loginStatus(String username, String password){
            if (loginUser(username, password, savedUsername, savedPassword)) {
                return"login successful";
            }else{
                return "Login failed"; 
            }
        }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner quickChat = new Scanner(System.in);
       
        System.out.println("Enter your firstname");
        String firstname = checkfirstName(quickChat.nextLine().trim());
        
        System.out.println("Enter your lastname");
        String lastName = checklastName(quickChat.nextLine().trim());
        
        System.out.println("Enter your usernsme");
        String username = quickChat.nextLine();
        boolean isUsernameValid = checkusername(username);
        
        System.out.println("Enter your password");
        String password = quickChat.nextLine();
        boolean passwordValid=checkPasswordcomplexity(password);
        
        System.out.println("Enter your cellphone number");
        boolean phoneValid = checkcellphone(quickChat.nextLine());
     
        boolean isRegistered = false;
        if (isUsernameValid && passwordValid && phoneValid) {
            savedUsername = username;
            savedPassword = password;
            System.out.println("Registration successful");
            System.out.println(loginStatus(username, password));
            isRegistered = true;
        } else {
            System.out.println("Registration failed");
        }
      

        if (isRegistered){
        System.out.println(loginStatus(username, password));

        }
        quickChat.close();
    }
    
}
