package es.amplia.micro.streaming.analytics.services.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import es.amplia.micro.streaming.analytics.dto.DMMCollectionDto;

@Repository
public interface DMMCollectionRepository extends MongoRepository<DMMCollectionDto, String> {

}
