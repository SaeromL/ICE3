/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package midtermreviewcodeforpartc;

/**
 *
 * @author Saerom Lee
 */
public class PasswordValidator {
    
    public static boolean vaildPassword(String password) {
        
        int specialCharCount=0;
        for(int i = 0; i < password.length(); i++){
            
            if(!(Character.isLetterOrDigit(password.charAt(i))))
            {
                //now we know there is at least one special character
                specialCharCount++;
            }
        }

        if(specialCharCount > 0 && password.length() > 7){
            
            return true;
        }
        
        return false;
    }

}
