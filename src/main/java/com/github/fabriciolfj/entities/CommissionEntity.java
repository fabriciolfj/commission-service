package com.github.fabriciolfj.entities;


import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommissionEntity {

    private BigDecimal commission;
    private String partner;
    private Integer portion;
    private BigDecimal loan;
    private BigDecimal installment;

    public CommissionEntity calcule(final BigDecimal value) {
        this.commission = loan.multiply(value.divide(BigDecimal.valueOf(100)));
        return this;
    }
}
