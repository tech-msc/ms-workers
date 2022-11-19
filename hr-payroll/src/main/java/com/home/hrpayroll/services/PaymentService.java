package com.home.hrpayroll.services;

import com.home.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Rute", 215.0, days);
    }
}