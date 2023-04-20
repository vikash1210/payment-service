package com.example.paymentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
@Table(name="Transaction_Details")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="order_id")
    private long orderId;

    @Column(name="payment_mode")
    private String paymentMode;

    @Column(name="reference_number")
    private String referenceNumber;

    @Column(name="payment_date")
    private Instant paymentDate;

    @Column(name="payment_status")
    private String paymentStatus;

    @Column(name="order_amount")
    private long amount;
}
