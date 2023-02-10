package co.develhope.springrepositories2.entities;

import javax.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column(nullable = false)
    public String name;
    public Integer firstAppearance;
    @Column(nullable = false)
    public String inventor;


}