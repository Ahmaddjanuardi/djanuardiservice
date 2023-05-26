package com.djanuardi.customer;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @SequenceGenerator(name = "customer_id_sequance",
            sequenceName = "customer_id_sequance"
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "customer_id_sequance"
    )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
