package com.example.demo.Q11_MVC.Controller;

import java.util.List;
import com.example.demo.Q11_MVC.Model.User;
import com.example.demo.Q11_MVC.Service.UserService;
import com.example.demo.Q11_MVC.View.UserView;

public class UserController {
    private UserService service;
    private UserView view;

    public UserController(UserService service, UserView view) {
        this.service = service;
        this.view = view;
    }

    // end point
    // create user

    public void createUser(String id, String name, String email, int number) {
        service.addUser(new User(id, name, email, number));
        view.displayMsg("User add successfully");
    }

    // read user
    public void readUser(String id) {
        // service.getById(id);
        view.displayUser(service.getById(id));
    }

    public void readAllUser() {
        List<User> rau = service.getAllUser();
        if (rau.isEmpty()) {
            view.displayMsg("koi bhi user nhi list khalli hai bsdk");
        } else {
            for (User u : rau) {
                view.displayUser(u);
            }
        }
    }

    // Update
    public void updateUser(String id, String newName, String newEmail,int number) {
        boolean success = service.updateUser(id, newName, newEmail, number);
        view.displayMsg(success ? "User updated successfully." : "User not found.");
    }

    // delete
    public void deleteUser(String id) {
        boolean success = service.deleteUser(id);
        view.displayMsg(success ? "User deleted successfully." : "User not found.");
    }
}
