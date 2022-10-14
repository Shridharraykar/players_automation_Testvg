package com.test.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    private String name;
    private String location;
    private List<Player> player;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data

    public static class Player{
        private String name;
        private String country;
        private String role;
        @JsonProperty("price-in-crores")
        private String priceInCrores;
    }

}
