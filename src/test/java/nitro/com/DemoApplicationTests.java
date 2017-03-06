package nitro.com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	PassportRepo passportRepo;

@Before
@Rollback(false)

	public void setUp() {

	Student and = new Student("Andrey", "First");
	Student ser = new Student("Sergey", "Second");

	and.setPassport(passportRepo.save(new Passport("KO 454378424347")));
	ser.setPassport(passportRepo.save(new Passport("KO 698456143546")));

	studentRepo.save(ser);
	studentRepo.save(and);

	Assert.assertEquals(2, studentRepo.findAll().size());

	System.out.println(studentRepo.findAll());
}

	@Test
	public void getCount() {
	logger.info("***********");
	logger.info("count "+studentRepo.count());

	}

}
