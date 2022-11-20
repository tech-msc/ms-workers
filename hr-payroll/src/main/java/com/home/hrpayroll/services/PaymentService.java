package com.home.hrpayroll.services;

import com.home.hrpayroll.entities.Payment;
import com.home.hrpayroll.entities.http.Worker;
import com.home.hrpayroll.feignclient.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

}