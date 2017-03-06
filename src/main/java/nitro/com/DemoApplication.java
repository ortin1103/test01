package nitro.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DemoApplication.class, args);

		StudentRepo studentRepo= context.getBean(StudentRepo.class);

		studentRepo.save(new Student("Jack", "Bauer"));
		studentRepo.save(new Student("Chloe", "O'Brian"));
		studentRepo.save(new Student("Kim", "Bauer"));
		studentRepo.save(new Student("David", "Palmer"));
		studentRepo.save(new Student("Michelle", "Dessler"));

		// fetch all customers
		Iterable<Student> students = studentRepo.findAll();
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();

		// fetch an individual customer by ID
		Student student = studentRepo.findOne(1L);
		System.out.println("Customer found with findOne(1L):");
		System.out.println("--------------------------------");
		System.out.println(student);
		System.out.println();

		// fetch customers by last name
		List<Student> bauers = studentRepo.findByLastName("Bauer");
		System.out.println("Customer found with findByLastName('Bauer'):");
		System.out.println("--------------------------------------------");
		for (Student bauer : bauers) {
			System.out.println(bauer);
		}

		context.close();
	}

}


