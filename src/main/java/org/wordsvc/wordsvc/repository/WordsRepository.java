package org.wordsvc.wordsvc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.wordsvc.wordsvc.model.Words;
@Repository
public interface WordsRepository extends MongoRepository<Words,String> {

}