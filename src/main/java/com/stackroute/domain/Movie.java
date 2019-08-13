package com.stackroute.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {
    @Id

    private int id;
    private String movieName;
    private String moviereleased;
}
