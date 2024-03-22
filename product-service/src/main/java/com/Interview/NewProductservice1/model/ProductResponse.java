package com.Interview.NewProductservice1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ProductResponse {
    String name;
    String description;
    BigDecimal price;

}
