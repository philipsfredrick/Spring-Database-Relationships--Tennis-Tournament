package com.nonso.databaserelationships.manytomany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(unique = true) // unique ensures no repetition of category.
    private String name;

    @ManyToMany(mappedBy = "categories", cascade = {CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("categories")
    private List<Tourney> tourneys = new ArrayList<>();
}
