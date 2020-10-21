package nosmokes;

import nosmokes.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCheckOuted_CheckOut(@Payload CheckOuted checkOuted){

        if(checkOuted.isMe()){
            System.out.println("##### listener CheckOut : " + checkOuted.toJson());
        }
    }

    @Autowired
    EarnRepository EarnRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverGoodEaten_Eat(@Payload GoodEaten goodEaten){

        if(goodEaten.isMe()){

            Earn earn = new Earn();
            earn.setCheckInId(goodEaten.getId());
            earn.setPoint(goodEaten.getNumber());
            //earn.setStatus(checkOuted.getStatus());

            EarnRepository.save(earn);
        }
    }
}
