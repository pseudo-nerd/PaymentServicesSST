package org.example.paymentservicesst.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class InitiatePaymentRequestDto {
    private Long orderId;
    private String email;
}
