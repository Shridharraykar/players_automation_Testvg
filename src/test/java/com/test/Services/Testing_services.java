package com.test.Services;


import com.test.Model.Team;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Testing_services {


    public static void testForeignPlayers() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Team rcb = objectMapper.readValue(new File("src/main/resources/RCB.json"), Team.class);
        System.out.println("team name:" +rcb.getName() +rcb.getPlayer());


        }
    }
