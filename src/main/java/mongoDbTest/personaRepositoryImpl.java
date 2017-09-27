package mongoDbTest;

import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class personaRepositoryImpl implements personRepositoryCustom {

	@Autowired
	MongoTemplate mongoTemplate;

	public int updateFirstName(String firstName,String with) {
		Query query = new Query(Criteria.where("firstName").is(firstName));
		Update update = new Update();
		update.set("firstName", with);

		WriteResult result = mongoTemplate.updateFirst(query, update, Persona.class);

		
		if (result != null)
			return result.getN();
		else
			return 0;
	}

}
