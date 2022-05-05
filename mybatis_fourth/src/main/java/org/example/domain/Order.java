package org.example.domain;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Integer id;
    private Integer number;
    private List<Product> products;
}
