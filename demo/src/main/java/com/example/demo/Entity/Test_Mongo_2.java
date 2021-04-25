package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Test_Mongo_2
{
    @Id
    private int id_test;

    private String str_2;
}
