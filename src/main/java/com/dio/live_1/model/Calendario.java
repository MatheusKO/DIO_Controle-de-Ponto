package com.dio.live_1.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Calendario {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @ManyToOne
    @JoinColumn(name = "tipo_data_id")
    private TipoData tipoData;

    private String descricao;
    private LocalDateTime dataEspecial;
}
