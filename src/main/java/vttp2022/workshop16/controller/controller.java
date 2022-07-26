package vttp2022.workshop16.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.Provider.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import vttp2022.workshop16.model.BoardMain;
import vttp2022.workshop16.service.GameService;

@RestController
public class controller {

    @Autowired
    GameService service;

    private static final Logger logger = LoggerFactory.getLogger(controller.class);

    @PostMapping(path="/api/boardgame", consumes="application/json")
    public ResponseEntity<String> postBoard(@RequestBody BoardMain boardMain){
        service.saveRedis(boardMain);
        // final JsonObject resp = Json.createObjectBuilder().build();
        return ResponseEntity.ok(boardMain.toString());
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
