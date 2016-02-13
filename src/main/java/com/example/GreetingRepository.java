package com.example;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "greeting", path = "greetings")
public interface GreetingRepository extends PagingAndSortingRepository<Greeting, Long> {
}
