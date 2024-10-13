package com.study.riotApiApplication.client;

import com.study.riotApiApplication.dto.SummonerDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RiotApiClient {

    @Value("${riot.api.key}")
    private String riotApiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public SummonerDTO fetchSummonerByName(String name) {
        String SummonerName = name.replaceAll(" ", "%20");
        String requestURL = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+ SummonerName + "?api_key=" + riotApiKey;

        ResponseEntity<SummonerDTO> response = restTemplate.getForEntity(requestURL, SummonerDTO.class);
        return response.getBody();
    }
}
