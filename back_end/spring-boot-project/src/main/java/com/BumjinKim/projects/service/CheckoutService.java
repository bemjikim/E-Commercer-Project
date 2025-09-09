package com.BumjinKim.projects.service;

import com.BumjinKim.projects.dto.PaymentInfo;
import com.BumjinKim.projects.dto.Purchase;
import com.BumjinKim.projects.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
