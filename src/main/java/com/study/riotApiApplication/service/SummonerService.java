package com.study.riotApiApplication.service;

import com.study.riotApiApplication.client.RiotApiClient;
import com.study.riotApiApplication.dto.SummonerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummonerService {

    @Autowired
    private RiotApiClient riotApiClient;

    public SummonerDTO getSummonerByName(String summonerName) {
        return riotApiClient.fetchSummonerByName(summonerName);
    }
}
