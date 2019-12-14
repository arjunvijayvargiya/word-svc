package org.wordsvc.wordsvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.wordsvc.wordsvc.repository.WordsRepository;

@EnableMongoRepositories(basePackageClasses = WordsRepository.class)
@Configuration
public class MongoConfig {
}
