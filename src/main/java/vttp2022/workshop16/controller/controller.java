package vttp2022.workshop16.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.Provider.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp2022.workshop16.model.BoardMain;
import vttp2022.workshop16.service.GameService;

@RestController
public class controller {

    @Autowired
    GameService service;
    BoardMain board;

    private static final Logger logger = LoggerFactory.getLogger(controller.class);

    @PostMapping(path="/api/boardgame", consumes="application/json")
    public ResponseEntity<String> postBoard(@RequestBody String payload){ //changed BoardMain boardMain to String payload because request body comes in as a string instead of type boardmain, do conversion below
        JsonObject body;
        logger.info("Within postboard");
        try(InputStream is = new ByteArrayInputStream(payload.getBytes())){
                JsonReader reader = Json.createReader(is);
                body = reader.readObject();
                String bodyString = body.toString();
                ObjectMapper mapper = new ObjectMapper();
                board = mapper.readValue(bodyString, BoardMain.class);
                service.saveRedis(board);
        }catch(Exception e){
            body = Json.createObjectBuilder().add("err", e.getMessage()).build();
            return ResponseEntity.internalServerError().body(body.toString());
        }
        HttpHeaders headers = new HttpHeaders();
        headers.add("insert_count", "1");
        headers.add("id", board.getName());
        return new ResponseEntity(board.toString(), headers, HttpStatus.OK);
        //BoardMain boardMain
        // service.saveRedis(boardMain);
        // final JsonObject resp = Json.createObjectBuilder().build();
        // return ResponseEntity.ok("boardMain.toString()");
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
