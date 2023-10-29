package dev.seta.eapi.dao.unit;

import dev.seta.eapi.dao.description.Description;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private List<String> subjects;

    @OneToMany(mappedBy = "unit")
    private List<Description> description;
}