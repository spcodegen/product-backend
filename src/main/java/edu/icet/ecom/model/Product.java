package edu.icet.ecom.model;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Product {
    private String name;
    private String description;
    private Double price;
}
