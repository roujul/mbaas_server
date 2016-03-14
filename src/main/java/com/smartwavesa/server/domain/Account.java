package com.smartwavesa.server.domain;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Created by jroux on 14.03.2016.
 */
public class Account {

    private String lastname;
    private String firstname;
    private String occupation;

    // ************************************************************************

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        return new EqualsBuilder().//
                append(lastname, other.lastname).//
                append(firstname, other.firstname).//
                append(occupation, other.occupation).//
                isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().//
                append(lastname).//
                append(firstname).//
                append(occupation).//
                toHashCode();
    }

    // ************************************************************************

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
