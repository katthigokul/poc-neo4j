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
public class MovieStars {
    @Id

    private int id;
    private int age;
    private String name;
    private String gender;
}
