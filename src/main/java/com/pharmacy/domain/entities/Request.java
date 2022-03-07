package com.pharmacy.domain.entities;

import com.pharmacy.domain.enums.StatusRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request {

    private String cpfCliente;
    private String codigoRemedio;
    private Integer quantidade;
    private StatusRequest statusRequest;
}
