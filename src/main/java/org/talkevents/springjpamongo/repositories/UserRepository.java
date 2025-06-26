package org.talkevents.springjpamongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.talkevents.springjpamongo.documents.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
