package com.jaugusto.paymentservice.service.impl;

import com.jaugusto.paymentservice.model.Payment;
import com.jaugusto.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@RequiredArgsConstructor
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;
    @Override
    @SneakyThrows
    public void sendPayment(Payment payment) {
        log.info("payment received!", payment);
        Thread.sleep(5000);
        log.info("sending payment to \"payment-topic\" topic ...");
        kafkaTemplate.send("payment-topic", payment);
    }
}
