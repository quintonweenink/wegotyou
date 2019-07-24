package main.user;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
@Data
public class TestEntity {

    @Id
    private Long id;

    @Column
    private String name;


}
