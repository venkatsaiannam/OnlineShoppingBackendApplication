package com.onlineShopping.backend.service;

import com.onlineShopping.backend.dao.*;
import com.onlineShopping.backend.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class RoleService {

	  @Autowired
	    private RoleDao roleDao;

	    public Role createNewRole(Role role) {
	        return roleDao.save(role);
	    }
}
