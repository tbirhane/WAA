package mum.edu.cs.persistence.service;



import mum.edu.cs.persistence.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role get(Long id);
}
