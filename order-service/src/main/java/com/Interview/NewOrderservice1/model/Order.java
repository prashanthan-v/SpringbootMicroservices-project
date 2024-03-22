package com.Interview.NewOrderservice1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_order")
public class Order {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Orderid;
    String orderno;
    @OneToMany(cascade = CascadeType.ALL)
    List<AboutItems>AboutItemslist;
}
