package com.Interview.NewOrderservice1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_AboutItems")
public class AboutItems {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

   private  Integer itemno;
   private String name;
   private Integer quantity;

}
