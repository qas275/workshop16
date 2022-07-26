package vttp2022.workshop16.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp2022.workshop16.model.BoardMain;

@RestController
public class controller {
    private static final Logger logger = LoggerFactory.getLogger(controller.class);

    @PostMapping(path="/api/boardgame", consumes="application/json")
    public BoardMain postBoard(@RequestBody BoardMain boardMain){
        
        return boardMain;
    }
    // public ResponseEntity<String> postUser(@RequestBody String payload){
        
    //     JsonObject body;
    //     try (InputStream is = new ByteArrayInputStream(payload.getBytes())) 
    //     {
    //         JsonReader reader = Json.createReader(is);
    //         body = reader.readObject();
    //     } catch (Exception e) 
    //     {   System.err.println(e);}




    }

}
