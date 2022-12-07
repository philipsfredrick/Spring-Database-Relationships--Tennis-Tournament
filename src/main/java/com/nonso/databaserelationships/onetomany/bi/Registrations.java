package com.nonso.databaserelationships.onetomany.bi;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Registrations {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private Date registrationDate;

    // Note the cascade types used without remove type. To prevent player record delete when registration is deleted.
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "players_id", referencedColumnName = "id")
    private Players players;

    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", registrationDate=" + registrationDate +
                ", player=" + players +
                '}';
    }
}
