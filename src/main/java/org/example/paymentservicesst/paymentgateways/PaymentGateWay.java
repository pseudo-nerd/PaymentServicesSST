package org.example.paymentservicesst.paymentgateways;

import com.razorpay.RazorpayException;

public interface PaymentGateWay {
    public String generatePaymentLink(Long orderId, String email) throws RazorpayException;
}
