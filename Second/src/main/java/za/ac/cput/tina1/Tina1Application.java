package za.ac.cput.tina1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tina1Application {

    public static void main(String[] args) {
        SpringApplication.run(Tina1Application.class, args);
        Student s = new Student();

        s.marks(89);
    }
}