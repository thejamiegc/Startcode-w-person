/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tha
 */
public class PersonDTO {
    private long id;
    private String firstname;
    private String lastname;
    private String phone;
    private LocalDate created;
    private LocalDate lastEdited;

    public PersonDTO(String firstname, String lastname, String phone, LocalDate created, LocalDate lastEdited) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.created = created;
        this.lastEdited = lastEdited;
    }

    public static List<PersonDTO> getDtos(List<entities.Person> rms){
        List<PersonDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new PersonDTO(rm)));
        return rmdtos;
    }


    public PersonDTO(entities.Person rm) {
        if(rm.getId() != null)
            this.id = rm.getId();
        this.firstname = rm.getFirstname();
        this.lastname = rm.getLastname();
        this.phone = rm.getPhone();
        this.created = rm.getCreated();
        this.lastEdited = rm.getLastEdited();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(LocalDate lastEdited) {
        this.lastEdited = lastEdited;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", created=" + created +
                ", lastEdited=" + lastEdited +
                '}';
    }
}
