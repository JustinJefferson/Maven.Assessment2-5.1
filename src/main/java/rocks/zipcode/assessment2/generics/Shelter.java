package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> implements Iterable{

    private LinkedList<T> shelter;

    public Shelter() {

        shelter = new LinkedList<>();
        // throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelter.size();
    }

    public void add(T object) {
        shelter.add(object);
    }

    public Boolean contains(T object) {
        return shelter.contains(object);
    }

    public void remove(T object) {
        shelter.remove(object);
    }

    public T get(Integer index) {
        return shelter.get(index);
    }

    public Integer getIndexOf(T ageable) {
        return shelter.indexOf(ageable);
    }

    public Iterator<T> iterator() { return null; }
}