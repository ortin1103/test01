package nitro.com;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	@Autowired
	StudentRepo studentRepo;


@Before
@Rollback(false)
		public void setUp() {


	Student and = new Student("Andrey", "First");
	//and.setPassports(new Passport("KO 454378424347"));

	Student ser = new Student("Sergey", "Second");
	//ser.setPassports(new Passport("KO 698456143546"));
	studentRepo.save(Arrays.asList(and,ser));


}



	@Test
	public void getCount() {
	logger.info("***********");
	logger.info("count "+studentRepo.count());

	}

}
