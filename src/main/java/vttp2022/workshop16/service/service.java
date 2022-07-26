package vttp2022.workshop16.service;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.json.JsonObject;
import vttp2022.workshop16.model.BoardMain;
import vttp2022.workshop16.model.DecodingBoard;
import vttp2022.workshop16.model.Pegs;
import vttp2022.workshop16.model.Pieces;
import vttp2022.workshop16.model.Type;

@Service
public class service {
    private static final Logger logger = LoggerFactory.getLogger(service.class);
    
    public void saveRedis(JsonObject body){
        
        BoardMain boardmain = new BoardMain();
        Pieces pieces;
        DecodingBoard decodeBoard;
        Pegs peg;
        Type typeboard;
        
        boardmain.setName(body.get("name").toString());
        
        ObjectMapper objectmapper = new ObjectMapper();
        Map<String, Object> parsedJson = objectmapper.readValue(body, new TypeReference<Map<String,Object>>(){});
        typeboard.setCount((body.get("pieces")).get("decoding_board"));
        
    }
}
