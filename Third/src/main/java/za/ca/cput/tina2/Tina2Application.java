package za.ca.cput.tina2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tina2Application {

    public static void main(String[] args) {
        SpringApplication.run(Tina2Application.class, args);
        Student s = new Student();
        s.student("Yolanda, ", "YM201596, ","IT, ","Meghan");
    }

}
