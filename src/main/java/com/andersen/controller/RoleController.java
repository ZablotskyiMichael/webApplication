package com.andersen.controller;

import com.andersen.model.Role;
import com.andersen.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public Iterable<Role> getAllRoles() {
        return roleService.findAllRole();
    }
    @DeleteMapping("/role/{id}")
    public void deleteById(@PathVariable long id){
        roleService.deleteById(id);
    }
    @GetMapping("/role/{id}")
    public Role getById(@PathVariable long id){
        return roleService.getById(id);
    }

    @PostMapping("/role/")
    public void update( @RequestBody Role role){
        roleService.put(role);
    }
    @PutMapping("/role")
    public void create( @RequestBody Role role){
        roleService.create(role);
    }
}
