package com.example.demo.Q11_MVC.View;
import com.example.demo.Q11_MVC.Model.User;
public class UserView {
    //Display User
    public void displayUser(User usb){
        if(usb != null){
            System.out.println(usb);
        }
        else{
            System.out.println("User not found 404");
        }
        System.out.println();
    } 

    //Display Msg

    public void displayMsg(String msg){
        System.out.println(msg+"\n");
        
    }
}
