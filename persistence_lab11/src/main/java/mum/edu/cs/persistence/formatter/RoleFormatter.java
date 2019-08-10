package mum.edu.cs.persistence.formatter;



import mum.edu.cs.persistence.model.Role;
import mum.edu.cs.persistence.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;


@Component
public class RoleFormatter implements Formatter<Role> {

    @Autowired
    private RoleService roleService;

    @Override
    public String print(Role role, Locale locale) {
        System.out.println("***********");
        return String.valueOf(role.getId());
    }

    @Override
    public Role parse(String text, Locale locale) throws ParseException {
        System.out.println("-----------" + text);
        System.out.println(roleService.get(Long.parseLong(text)).getRole());
        return roleService.get(Long.parseLong(text));
    }

}
