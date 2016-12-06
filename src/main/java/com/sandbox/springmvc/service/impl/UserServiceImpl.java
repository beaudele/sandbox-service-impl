package com.sandbox.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sandbox.springmvc.dao.UserDao;
import com.sandbox.springmvc.model.RegisteredUser;
import com.sandbox.springmvc.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public List<RegisteredUser> findAllUsers() {
		return userDao.findAllUsers();
	}

	public RegisteredUser findById(Long id) {
		return userDao.findById(id);
	}

	public RegisteredUser findByName(String name) {
		return userDao.findByName(name);
	}

	public void saveUser(RegisteredUser user) {
		userDao.saveUser(user);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateUser(RegisteredUser user) {
		userDao.updateUser(user);
	}

	public void deleteUserById(Long id) {
		userDao.deleteUserById(id);
	}

	public boolean isUserExist(RegisteredUser user) {
		return userDao.isUserExist(user);
	}

	public void deleteAllUsers() {
		userDao.deleteAllUsers();
	}
}
