package com.saumya.fun.views;

import com.saumya.fun.core.Tutorial;

import io.dropwizard.views.View;

public class PersonView extends View {
    private final Tutorial person;

    public enum Template {
        FREEMARKER("freemarker/person.ftl"),
        MUSTACHE("mustache/person.mustache");

        private String templateName;

        Template(String templateName) {
            this.templateName = templateName;
        }

        public String getTemplateName() {
            return templateName;
        }
    }

    public PersonView(PersonView.Template template, Tutorial person) {
        super(template.getTemplateName());
        this.person = person;
    }

    public Tutorial getPerson() {
        return person;
    }
}
