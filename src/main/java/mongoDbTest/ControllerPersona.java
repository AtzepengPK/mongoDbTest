package mongoDbTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPersona {

	@Autowired
	personaRepository repository;
	
	SpringLogger logger = new SpringLogger(this.getClass(),"test");

	@RequestMapping("/search")
	public List<Persona> custom(@RequestParam(value = "firstname", required = false, defaultValue = "a") String firstName){
		logger.helpMethod();
		return repository.findCustomByFirstName(firstName);
	}
	@RequestMapping("/all")
	public List<Persona> all(){	
		return repository.findAll();
	}
	
	@RequestMapping("/update")
	public int update(@RequestParam(value = "firstname", required = false, defaultValue = "a") String firstName,
			@RequestParam(value = "with", required = false, defaultValue = "a") String with
			){
		
		return repository.updateFirstName(firstName,with);
	}
}
