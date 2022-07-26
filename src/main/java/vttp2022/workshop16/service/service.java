package vttp2022.workshop16.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import jakarta.json.JsonObject;
import vttp2022.workshop16.model.BoardMain;


@Service
public class service {
    private static final Logger logger = LoggerFactory.getLogger(service.class);
    
    public void saveRedis(JsonObject body){
        
        BoardMain boardmain = new BoardMain();

        
        boardmain.setName(body.get("name").toString());
        
        JsonObject decodingBoard = body.getJsonObject("decoding_board");
        String total_count = decodingBoard.get("total_count").toString();
        logger.info(total_count);
        
        
            
    
        
    }

    public void createBoardMain(){}
}
