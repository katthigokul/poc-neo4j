package com.stackroute.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository marks the specific class as a Data Access Object
 */
@Repository
public interface MovieStarsRepository extends Neo4jRepository<MovieStarsRepository, Integer> {
}
