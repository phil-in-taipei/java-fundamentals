package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StudentGenerator{
    StudentClass createStudent(String firstName, String lastName);
}

public class StudentClass {
    @Override
    public String toString() {
        return "StudentClass{ " +
                "\n givenName='" + givenName + "'," +
                "\n surname='" + surname + '\'' +
                "\n}";

    }

    String givenName;
    String surname;

    public StudentClass(String givenName, String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }
}
