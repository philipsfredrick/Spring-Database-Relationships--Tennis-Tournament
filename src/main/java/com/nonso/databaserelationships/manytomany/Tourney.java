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
@Table(name = "tourneys")
public class Tourney {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;
    private String location;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable(name = "tourney_categories", joinColumns = @JoinColumn(name = "tourney_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    @JsonIgnoreProperties("tourneys")
    private List<Category> categories = new ArrayList<>();

    public void addCategory(Category category) {
        categories.add(category); // unidirectional
        // set up bidirectional relationship
        category.getTourneys().add(this);
    }

    //remove category
    public void removeCategory(Category category) {
        if (categories != null)
        categories.remove(category);
        // update bidirectional relationship
        category.getTourneys().remove(this);
    }

    @Override
    public String toString() {
        return "Tourney{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", categories=" + categories +
                '}';
    }
}
