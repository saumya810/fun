package com.saumya.fun.db;

import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.saumya.fun.core.Tutorial;

import java.util.List;
import java.util.Optional;

public class PersonDAO extends AbstractDAO<Tutorial> {
    public PersonDAO(SessionFactory factory) {
        super(factory);
    }

    public Optional<Tutorial> findById(Long id) {
        return Optional.ofNullable(get(id));
    }

    public Tutorial create(Tutorial person) {
        return persist(person);
    }

    @SuppressWarnings("unchecked")
    public List<Tutorial> findAll() {
        return list((Query<Tutorial>) namedQuery("com.saumya.fun.core.Tutorial.findAll"));
    }
}
