package com.test;

import com.test.Model.Team;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class IplTeamTest {
    @Test
    public void testNumberofForeignPlayersCount() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Team rcb = objectMapper.readValue(new File("src/test/resources/RCB.json"), Team.class);
        int foreignPlayersCount = (int)rcb.getPlayer().stream()
                .filter(player -> !player.getCountry().equals("India")).count();
        Assert.assertEquals(foreignPlayersCount,4);
    }

    @Test
    public void isWicketKeeperPresent() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Team rcb = objectMapper.readValue(new File("src/test/resources/RCB.json"), Team.class);
        boolean isWicketKeeperPresent = rcb.getPlayer().stream().anyMatch(player -> player.getRole().equals("Wicket-keeper"));
        Assert.assertTrue(isWicketKeeperPresent);
    }
}
