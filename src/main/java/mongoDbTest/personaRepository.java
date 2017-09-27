package mongoDbTest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends MongoRepository<Persona, String>,personRepositoryCustom {

	 public Persona findFirstByFirstName(String firstName);
	 public List<Persona> findByLastName(String lastName);
	 public List<Persona> findByAge(int age); 
	 public List<Persona> findByFirstNameAndAge(String firstName,int age); 
	 
	 @Query("{firstName:'?0'}")
	 public List<Persona> findCustomByFirstName(String firstName); 
	 
}
