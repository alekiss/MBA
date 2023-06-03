package br.com.acme.application.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class Card {
    private Long id;
    private String flag;
    private String number;
    private BigDecimal limit;
}
