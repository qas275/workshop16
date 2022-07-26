package vttp2022.workshop16.service;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;


import jakarta.json.JsonObject;
import vttp2022.workshop16.model.BoardMain;


@Service
public class GameService {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;


    private static final Logger logger = LoggerFactory.getLogger(GameService.class);
    
    public void saveRedis(BoardMain board){
        redisTemplate.opsForValue().set(board.getName(), board);
    }

    public void createBoardMain(BoardMain board){

    }
}
