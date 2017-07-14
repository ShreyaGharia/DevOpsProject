
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

/**
 * Created by Porwal Brother on 7/6/2017.
 */
@SpringBootApplication
public class Runner {
    public static HashMap<String,Employee> hmEmployee;
    public static void main(String[] args) {
        hmEmployee =new HashMap<String,Employee>();
        Employee employeeOne= new Employee("1","Shreya","Gharia");
        hmEmployee.put(employeeOne.getEmployeeId(),employeeOne);
        SpringApplication.run(Runner.class, args);

    }
}
