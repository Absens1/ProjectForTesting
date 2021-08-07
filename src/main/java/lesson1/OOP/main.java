package lesson1.OOP;

public class main {
    public static void main(String[] args) {
        Person person = Person.newBuilder("FirstName", "LastName")
                .setAge(21)
                .build();
        System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getAge());
    }
}
