/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cmsc495_project;

/**
 *
 * @author ryanb
 */
public class UserFunctions {
    
    /**
     * @param user the username entered
     * @param pword the password entered
     * @return isValid true for authenticated
     * Validates whether the user entered values for username and password are valid.
     * If they are, the graphical user interface should return that the user has been successfully authenticated 
     * and should be taken to the login screen. 
     * If the credentials are deemed invalid, the authentication should fail.
     * This function, along with the others below, will also be used to evaluate the proper functionality of the unit tests as well. 
     */
    public static boolean authenticate(String user, String pword) {
        boolean isValid = false;
        if (user.equalsIgnoreCase("sdevadmin")
                && pword.equals("460!pass")) {
            isValid = true;
        }

        return isValid;
    }
    
}
