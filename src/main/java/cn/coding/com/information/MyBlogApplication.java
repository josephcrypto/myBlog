package cn.coding.com.information;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBlogApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyBlogApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Server up and Running on port:9000 =========>>>>");
    }
}
