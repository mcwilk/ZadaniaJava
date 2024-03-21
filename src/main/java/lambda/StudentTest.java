package lambda;

public class StudentTest {

    public static void sayHello(String name, Student student) {
        student.sayHello(name);
    }

    public static void main(String[] args) {
        // Usage of class that implements Student interface
        StudentIT it = new StudentIT();
        sayHello("John", it);

        // Usage of anonymous class to do not create separate implementation for Student interface
        Student med = new Student() {
            @Override
            public void sayHello(String name) {
                System.out.println("I will be a doctor. My name is " + name);
            }
        };
        sayHello("Kate", med);

        // Usage of lambda
        Student noStudent = name -> {
            System.out.println("I am not a student anymore");
            System.out.println("Bla bla bla");
        };
        sayHello("Tom", noStudent);

    }
}

