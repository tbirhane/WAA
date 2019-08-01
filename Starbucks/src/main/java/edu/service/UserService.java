package edu.service;

import edu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserDao userDao;
    public HashMap<String, String> getAllUsers(){
        return userDao.getAllUsers();
    }
    public HashMap<String, List<String>> getAllAdvice(){
        return userDao.getAllAdvice();
    }
    public String getPassword(String name) {
        return userDao.getPassword(name);
    }
    public List<String> getAdvice(String roast) {
        return userDao.getAdvice(roast);
    }
}
