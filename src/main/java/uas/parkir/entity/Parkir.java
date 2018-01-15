package uas.parkir.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "parkir")
public class Parkir {

    @Id @Getter @Setter
    private int id;
    @Getter @Setter
    private String nama;
    @Getter @Setter
    private String plat;

}