package org.talkevents.springdatamongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.talkevents.springdatamongo.documents.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
