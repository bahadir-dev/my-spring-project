package com.bahd.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@Data
@NoArgsConstructor
public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal merchantPayAmount;
    private BigDecimal comissionAmount;

    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    @OneToOne(mappedBy = "paymentDetail" , cascade = CascadeType.ALL)
    private Payment payment;

    public PaymentDetail(BigDecimal merchantPayAmount, BigDecimal comissionAmount, LocalDate payoutDate) {
        this.merchantPayAmount = merchantPayAmount;
        this.comissionAmount = comissionAmount;
        this.payoutDate = payoutDate;
    }
}
