package com.pharmacy.domain.service;

import com.pharmacy.domain.entities.Client;
import com.pharmacy.domain.entities.Request;
import com.pharmacy.domain.repository.ClientRepository;
import com.pharmacy.domain.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    RequestRepository requestRepository;

    public List<Request> findRequestByCnsOrCpf(Client client){
        if(client != null){
            Optional<Client> clientFoundedByCpf = clientRepository.findById(client.getCPF());
            Optional<Client> clientFoundedByCns = clientRepository.findById(client.getCns());
            if(clientFoundedByCpf.isPresent() || clientFoundedByCns.isPresent()){
                List<Request> requests = null;
                for(Request request : requestRepository.findAll()){
                    if(clientFoundedByCpf.isPresent()){
                        if(Objects.equals(request.getCpfCliente(), clientFoundedByCpf.get().getCPF())){
                            requests.add(request);
                        }
                    }
                    if(clientFoundedByCns.isPresent()){
                        if(Objects.equals(request.getCnsCliente(), clientFoundedByCns.get().getCns())){
                            requests.add(request);
                        }
                    }
                }
                return requests;
            }
        }
        return null;
    }
}
