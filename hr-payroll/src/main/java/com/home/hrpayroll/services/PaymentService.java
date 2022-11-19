package com.home.hrpayroll.services;

import com.home.hrpayroll.entities.Payment;
import com.home.hrpayroll.entities.http.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String hrWorkerHost;

    @Autowired
    private RestTemplate restTemplate;
    public Payment getPayment(long workerId, int days) {
        Map<String, String> uriVariables = getVariableWorkerByID(workerId);
        String url = hrWorkerHost.concat("/workers/{id}");
        Worker worker = restTemplate.getForObject(url, Worker.class, uriVariables);

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }

    private static Map<String, String> getVariableWorkerByID(long workerId) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("id", Long.toString(workerId));
        return uriVariables;
    }
}