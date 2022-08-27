package com.customer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "customer")
public class Customer {

    @Id
    private String id;
    private String name;
    private int age;
}
