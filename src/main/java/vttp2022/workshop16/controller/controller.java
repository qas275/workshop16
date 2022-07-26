package vttp2022.workshop16.controller;

import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.JsonObject;

@RestController
public class controller {
    private static final Logger logger = LoggerFactory.getLogger(controller.class);

    @PostMapping(path="/api/boardgame", consumes="application/json")
    public ResponseEntity<String> postUser(@RequestBody String payload){
        
        JsonObject body;
        try (InputStream is = new ByteArrayInputStream(payload.getBytes()) 
        {
            JsonReader reader = Json.createReader(is);
            body = read.readObject();
        } catch(Exception e) 
        {   System.err.println(e);}






    }

}
