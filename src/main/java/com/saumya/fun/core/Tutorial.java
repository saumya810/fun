package com.saumya.fun.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tutorials_tbl")
@NamedQueries(
        {
                @NamedQuery(
                        name = "com.saumya.fun.core.Tutorial.findAll",
                        query = "SELECT p FROM Tutorial p"
                )
        })
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tutorial_id")
    private long id;

    @Column(name = "tutorial_title", nullable = false)
    private String title;

    @Column(name = "tutorial_author", nullable = false)
    private String author;

    @Column(name = "submission_date")
    private Date date;

    public Tutorial() {
    }

    public Tutorial(String fullName, String jobTitle, Date yearBorn) {
        this.title = fullName;
        this.author = jobTitle;
        this.date = yearBorn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
