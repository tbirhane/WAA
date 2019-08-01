package edu.controller;


import edu.data.DataFacade;
import edu.data.DataFacadeFactory;
import edu.model.User;
import edu.service.IUserService;
import edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private IUserService userService;
    @GetMapping(value = "login")
    public String getLoginPage(HttpSession session){
        //DataFacade data = (new DataFacadeFactory()).getDataFacadeInstance(version);
        session.setAttribute("datasource",userService.getAllUsers());
        return "login";
    }
    @PostMapping(value = "login.do")
    public String authenticateUser(User user, Model model){
//        DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");

//        String name = request.getParameter("name");
//        String password = request.getParameter("password");

        String expectedPassword = userService.getPassword(user.getName());
        if(expectedPassword == null || !expectedPassword.equals(user.getPassword())) {

            return "loginSuccessful";
            //			throw new RuntimeException("Username or Password is invalid");
        } else {
            return "login";
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/LoginSuccessful.jsp");
//            requestDispatcher.forward(request, response);
        }

    }
}
