package org.talkevents.springdatamongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.talkevents.springdatamongo.documents.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
}
