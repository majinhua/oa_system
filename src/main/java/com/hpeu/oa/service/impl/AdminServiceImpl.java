package com.hpeu.oa.service.impl;

import com.hpeu.oa.entity.User;
import com.hpeu.oa.exception.ServiceException;
import com.hpeu.oa.service.AdminService;

import java.util.List;

public class AdminServiceImpl implements AdminService {
    @Override
    public void add(User entity) throws ServiceException {
  
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void del(int id) {

    }

    @Override
    public User getEntity(String sql, int id) {
        return null;
    }

    @Override
    public List<User> getAll() throws ServiceException {
        return null;
    }
}
