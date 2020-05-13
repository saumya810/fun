package com.saumya.fun.resources;

import com.saumya.fun.core.Tutorial;
import com.saumya.fun.db.PersonDAO;

import io.dropwizard.hibernate.UnitOfWork;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/people")
@Produces(MediaType.APPLICATION_JSON)
public class PeopleResource {

    private final PersonDAO peopleDAO;

    public PeopleResource(PersonDAO peopleDAO) {
        this.peopleDAO = peopleDAO;
    }

    @POST
    @UnitOfWork
    public Tutorial createPerson(Tutorial person) {
        return peopleDAO.create(person);
    }

    @GET
    @UnitOfWork
    public List<Tutorial> listPeople() {
        return peopleDAO.findAll();
    }

}
