package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {

    private Long id;
    private String name;
    private Address address;
    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        id = Long.MIN_VALUE;
        name = "";
        address = new Address();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {

        Boolean equals = true;

        if (o instanceof Person) {
            Person person = (Person) o;
            //Check for null first
            if(id == null) {
                if(person.getId() != null) equals = false;
            }
            else {
                if(!person.getId().equals(id)) equals = false;
            }

            if(name == null) {
                if(person.name != null) equals = false;
            }
            else {
                if(!person.getName().equals(name)) equals = false;
            }

            if(address == null) {
                if(person.address != null) equals = false;
            }
            else {
                if(!person.getAddress().equals(address)) equals = false;
            }

        }
        else {
            return false;
        }
        return equals;
    }

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s', address=%s}", id, name, address.toString());
    }
}