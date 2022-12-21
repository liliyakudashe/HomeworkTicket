

import java.util.*;

public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int compareName (User a, User b) {
        return a.getName().compareTo(b.getName());
    }

    public int compareAge (User a, User b) {
        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void task1(Set <User> source) {
        Set <User> users = new TreeSet<>(source);
        Iterator<User> iterator = users.iterator();
        User lastElement = iterator.next();
        while(iterator.hasNext()){
            lastElement = iterator.next();
        }
       // return (List<User>) lastElement;

    }
}
