package br.com.crud.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column; 
import lombok.Getter;
import lombok.Setter;

@Entity
@Table( name = "usuarios")

public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter @Getter private Long id;

    @Column(name = "nome")
    @Setter @Getter private String nome ;

    @Column(name = "dataNascimento")
    @Setter @Getter private String dataNascimento ;

    @Column(name = "email")
    @Setter @Getter private String email ;
}