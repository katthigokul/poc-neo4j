package com.stackroute.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @NodeEntity to indicate that this class is directly mapped to a node in Neo4j.
 */
@NodeEntity
/* @Data, Lombok will generate getter and setter methods, toString methods, Equal & Hashcode methods*/
@Data
/*@AllArgsConstructor will add constructor with all properties in the class*/
@AllArgsConstructor
/*@NoArgsConstructor will add constructor with no arguments*/
@NoArgsConstructor

public class Movie {
    @Id
    private long id;
    private String title;
    private String director;
}
