package io.spring.stream.sample.transformer;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

@EnableBinding(Processor.class)
public class Transformer {

    @StreamListener(Processor.INPUT)
    @Output(Processor.OUTPUT)
    public String transform(String data) {
        System.out.println("data :" + data);
        return data;
    }
}
