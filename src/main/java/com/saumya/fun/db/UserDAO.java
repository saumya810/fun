package com.saumya.fun.db;

import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.saumya.fun.core.UserInfo;

import java.util.List;
import java.util.Optional;

public class UserDAO extends AbstractDAO<UserInfo> {
    public UserDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<UserInfo> findById(Long id) {
        return Optional.ofNullable(get(id));
    }

    public UserInfo create(UserInfo person) {
        return persist(person);
    }

    @SuppressWarnings("unchecked")
    public List<UserInfo> findAll() {
        return list((Query<UserInfo>) namedQuery("com.saumya.fun.core.UserInfo.findAll"));
    }
}
