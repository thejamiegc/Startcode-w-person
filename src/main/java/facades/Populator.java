/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.PersonDTO;

import javax.persistence.EntityManagerFactory;
import utils.EMF_Creator;

/**
 *
 * @author tha
 */
public class Populator {
    public static void populate(){
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        FacadeExample fe = FacadeExample.getFacadeExample(emf);
        fe.create(new PersonDTO(new entities.Person("Jamie", "callan","number",java.time.LocalDate.now(),java.time.LocalDate.now())));
        fe.create(new PersonDTO(new entities.Person("Isak", "Markus","69",java.time.LocalDate.now(),java.time.LocalDate.now())));
        fe.create(new PersonDTO(new entities.Person("Jamez", "Jameh","Jameson",java.time.LocalDate.now(),java.time.LocalDate.now())));

    }
    
    public static void main(String[] args) {
        populate();
    }
}
