package com.eureka.dog.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Joke {
    private Long id;
    private String type;
    private String setup;
    private String punchline;
}