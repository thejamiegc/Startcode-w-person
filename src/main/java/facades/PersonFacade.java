package facades;

import dtos.PersonDTO;

import javax.persistence.EntityManagerFactory;

public class PersonFacade implements IPersonFacade{

    private static FacadeExample instance;
    private static EntityManagerFactory emf;

    @Override
    public PersonDTO addPerson(String fName, String lName, String phone) {
        return null;
    }

    @Override
    public PersonDTO deletePerson(int id) {
        return null;
    }

    @Override
    public PersonDTO getPerson(int id) {
        return null;
    }

    @Override
    public PersonDTO getAllPersons() {
        return null;
    }

    @Override
    public PersonDTO editPerson(PersonDTO p) {
        return null;
    }
}
