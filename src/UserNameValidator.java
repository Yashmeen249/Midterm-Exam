
import java.util.Scanner;
import midtermreviewcodeforpartc.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yashmeen Sharma
 */
public class UserNameValidator {
    private void run()
    {
        int userCount=0;//keep track of number of users for array
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your desired user name:");
        String userName = sc.nextLine();
        boolean validusername=false;
        String password="";
        while(!validusername)
        {
            System.out.println("Usename must have at least one character");
            
            password = sc.nextLine();
            int specialCharCount=0;
           
            for(int i=0;i<username.length(); i++)
            {
                if(!(Character.isLetterOrDigit(username.charAt(i))))
                {
                    
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&username.length()>=1)
            {
                validusername=true;
            }
        }
        
        User newUser = new User(userName, password);
        System.out.println("UserName: " + userName);
        
    }//end run method
   
    
}//end class
    

