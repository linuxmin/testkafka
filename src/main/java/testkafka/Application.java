package testkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@SpringBootApplication
@EnableBinding(Sink.class)
public class Application {

    @StreamListener(Sink.INPUT)
    public void loggerSink(AdvertisementChangeModel advertisementChangeModel) {
    System.out.println(advertisementChangeModel.getAdItemName() + " " + advertisementChangeModel.getAction());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
