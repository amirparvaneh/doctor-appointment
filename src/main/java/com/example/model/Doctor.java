package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Doctor extends BaseEntity {

    private String name;
    @OneToMany(mappedBy = "doctor")
    private List<OpenTime> openTimeList;

}
