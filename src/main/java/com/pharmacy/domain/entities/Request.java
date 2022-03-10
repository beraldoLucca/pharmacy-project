package com.pharmacy.domain.entities;

import com.pharmacy.domain.enums.StatusRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request {

    private String cpfCliente;
    private String cnsCliente;
    private String codigoRemedio;
    private String dataRetirada;
    private String nomeQuemRetirou;
    private Integer quantidade;
    private StatusRequest statusRequest;
}
