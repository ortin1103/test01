package nitro.com;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student,Long> {
    List<Student> findByLastName(String lastName);
}
