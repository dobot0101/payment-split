package com.dobot.PaymentSplit.domain.PaymentSplit.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record PersonPaymentSplitRequest(
        @NotEmpty(message = "이름을 일벽하세요.") String name,
        @NotNull(message = "주문 금액을 입력하세요.") Long amount) {
}
