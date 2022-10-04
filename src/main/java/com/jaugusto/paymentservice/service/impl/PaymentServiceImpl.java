package com.jaugusto.paymentservice.service.impl;

import com.jaugusto.paymentservice.model.Payment;
import com.jaugusto.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT SERVICE IMPL ::: Recebi o pagamento", payment);
    }
}
