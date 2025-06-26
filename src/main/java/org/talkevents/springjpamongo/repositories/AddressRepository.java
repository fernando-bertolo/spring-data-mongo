package org.talkevents.springjpamongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.talkevents.springjpamongo.documents.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
}
