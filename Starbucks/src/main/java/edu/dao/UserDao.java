package edu.dao;

import edu.data.Database;
import edu.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserDao {
    private Database database = new Database();
    public HashMap<String, String> getAllUsers(){
        return database.getAllUsers();
    }
    public HashMap<String, List<String>> getAllAdvice(){
        return database.getAllAdvice();
    }
    public String getPassword(String name) {
        return database.getPassword(name);
    }
    public List<String> getAdvice(String roast) {
        return database.getAdvice(roast);
    }
}
