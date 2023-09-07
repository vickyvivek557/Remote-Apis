package com.example.remoteapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    RestTemplate restTemplate;
@GetMapping("/getInfo")
    public Object getMovieInfo(@RequestParam("id") int id){
        String url = "https://api.themoviedb.org/3/movie/" +id+"?api_key=99dbb307a83ec8dff8143bcc68bdb756";
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }
    @GetMapping("/getCostomInfo")
    public MovieResponse getCostomizedInfo(){
        String url = "https://api.themoviedb.org/3/movie/603692?api_key=99dbb307a83ec8dff8143bcc68bdb756";
        MovieResponse response = restTemplate.getForObject(url, MovieResponse.class);
        return response;
    }
    @GetMapping("get-student")
    public Object getLocalApi(@RequestParam("id") int regNo){
        String url = "http://localhost:8080/get?q=" + regNo;
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }
}
