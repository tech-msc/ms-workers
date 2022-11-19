package com.home.hrpayroll.entities.http;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Worker {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double dailyIncome;

}
