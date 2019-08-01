package edu.service;

import edu.dao.UserDao;

import java.util.HashMap;
import java.util.List;

public interface IUserService {

    public HashMap<String, String> getAllUsers();
    public HashMap<String, List<String>> getAllAdvice();
    public String getPassword(String name);
    public List<String> getAdvice(String roast);
}
