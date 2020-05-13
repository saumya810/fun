package com.saumya.fun.resources;

import com.saumya.fun.core.UserInfo;
import com.saumya.fun.db.UserDAO;

import io.dropwizard.hibernate.UnitOfWork;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.Date;
import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    private final UserDAO userDAO;

    public UserResource(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @POST
    @UnitOfWork
    public UserInfo createPerson(UserInfo person) {
    	person.setCreatedDate(new Date());
    	person.setLastLoggedIn(new Date());
        return userDAO.create(person);
    }

    @GET
    @UnitOfWork
    public List<UserInfo> listPeople() {
        return userDAO.findAll();
    }

}
