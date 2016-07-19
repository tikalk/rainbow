package app.repository;

import app.model.RainbowModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RainbowRepository extends MongoRepository<RainbowModel, String> {

}
