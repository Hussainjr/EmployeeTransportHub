package com.crm.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "type", nullable = false)
    private Character type;

    @Column(name = "create_time", nullable = false)
    private Timestamp createTime;

    @Column(name = "exceution_time", nullable = false)
    private Timestamp exceutionTime;

    @Column(name = "cancellation_time", nullable = false)
    private Timestamp cancellationTime;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name = "broker_id")
    private Broker brokerId;

}