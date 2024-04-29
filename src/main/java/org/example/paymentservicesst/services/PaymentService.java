package org.example.paymentservicesst.services;

import com.razorpay.RazorpayException;
import org.example.paymentservicesst.paymentgateways.PaymentGateWay;
import org.springframework.stereotype.Service;

@Service

public class PaymentService {
    private PaymentGateWay paymentGateway;
    PaymentService(PaymentGateWay paymentGateWay){
        this.paymentGateway = paymentGateWay;
    }

    public String initiatePayment(Long orderId , String email) throws RazorpayException{
        return paymentGateway.generatePaymentLink(orderId,email);
    }

}
