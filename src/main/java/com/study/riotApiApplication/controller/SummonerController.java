package com.study.riotApiApplication.controller;

import com.study.riotApiApplication.dto.SummonerDTO;
import com.study.riotApiApplication.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/summoner")
public class SummonerController {

    @Autowired
    private SummonerService summonerService;

    @GetMapping("/{summonerName}")
    public ResponseEntity<SummonerDTO> getSummonerInfo(@PathVariable String summonerName) {
        SummonerDTO summoner = summonerService.getSummonerByName(summonerName);
        return ResponseEntity.ok(summoner);
    }
}
