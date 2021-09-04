package com.dio.live_1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class NivelAcesso {
    @Id
    private long id;
    private String descricao;

}
