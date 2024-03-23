package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor extends BaseEntity {

    private String name;
    @OneToMany(mappedBy = "doctor")
    private List<OpenTime> openTimeList;

}
