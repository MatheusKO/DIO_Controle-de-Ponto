package com.dio.live_1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Localidade {
    @Id
    private long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
