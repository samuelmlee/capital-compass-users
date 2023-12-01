package org.capitalcompass.capitalcompassusers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PriceAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double priceThreshold;
}
