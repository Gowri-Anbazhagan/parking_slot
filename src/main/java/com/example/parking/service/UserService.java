//package com.example.parking.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.example.parking.model.User;
//import com.example.parking.repository.UserRepository;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository repo;
//
//    public void save(User u) {
//        repo.save(u);
//    }
//
//    public User findByUsername(String username) {
//        return repo.findByUsername(username);
//    }
//}
package com.example.parking.service;

import com.example.parking.model.User;
import com.example.parking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public void save(User user) {
        System.out.println("📌 Saving User: " + user.getUsername());
        repo.save(user);
    }

    public User findByUsername(String username) {
        return repo.findByUsername(username);
    }
}
