package com.sandbox.springmvc.service.impl;

import com.sandbox.springmvc.dao.UserDao;
import com.sandbox.springmvc.model.RegisteredUser;
import com.sandbox.springmvc.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The Class UserServiceImpl.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

  /** The user dao. */
  @Autowired
  UserDao userDao;

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#findAllUsers()
   */
  @Override
  public List<RegisteredUser> findAllUsers() {
    return userDao.findAllUsers();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#findById(java.lang.Long)
   */
  @Override
  public RegisteredUser findById(Long id) {
    return userDao.findById(id);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#findByName(java.lang.String)
   */
  @Override
  public RegisteredUser findByName(String name) {
    return userDao.findByName(name);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#saveUser(com.sandbox.springmvc.
   * model.RegisteredUser)
   */
  @Override
  public void saveUser(RegisteredUser user) {
    userDao.saveUser(user);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#updateUser(com.sandbox.
   * springmvc.model.RegisteredUser)
   */
  @Override
  @Transactional(propagation = Propagation.REQUIRES_NEW)
  public void updateUser(RegisteredUser user) {
    userDao.updateUser(user);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#deleteUserById(java.lang.Long)
   */
  @Override
  public void deleteUserById(Long id) {
    userDao.deleteUserById(id);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#isUserExist(com.sandbox.
   * springmvc.model.RegisteredUser)
   */
  @Override
  public boolean isUserExist(RegisteredUser user) {
    return userDao.isUserExist(user);
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.sandbox.springmvc.service.UserService#deleteAllUsers()
   */
  @Override
  public void deleteAllUsers() {
    userDao.deleteAllUsers();
  }
}
