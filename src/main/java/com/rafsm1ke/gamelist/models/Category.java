package com.rafsm1ke.gamelist.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity(name = "tb_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;
    private String name;
}
