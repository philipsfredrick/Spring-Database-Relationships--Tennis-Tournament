package com.nonso.databaserelationships.onetomany.bi;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.nonso.databaserelationships.onetoone.PlayerProfile;
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
//@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL, optional = false) // One-to-One relationship with the player and player profile. Cascade property
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    @JsonManagedReference // owing column uses @JoinColumn and referenced column stated.
    private PlayerProfile playerProfile;

    @OneToMany(mappedBy = "players", cascade = CascadeType.ALL)
    private List<Registrations> registrations = new ArrayList<>();

    //set up bidirectional relationship with Registration class
    public void registerPlayer(Registrations reg) {
        //add registration to the list
        registrations.add(reg);
        //set the player field in the registration
        reg.setPlayers(this);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", playerProfile=" + playerProfile +
                '}';
    }
}
