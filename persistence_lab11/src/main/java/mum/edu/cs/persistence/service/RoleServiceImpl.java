package mum.edu.cs.persistence.service;

import mum.edu.cs.persistence.model.Role;
import mum.edu.cs.persistence.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {

        return roleRepository.findAll();
    }

    @Override
    public Role get(Long id) {

        return roleRepository.findById(id).get();
    }

}
