package com.pharmacy.domain.service;

import com.pharmacy.domain.entities.Client;
import com.pharmacy.domain.entities.Request;
import com.pharmacy.domain.repository.ClientRepository;
import com.pharmacy.domain.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    RequestRepository requestRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Transactional
    public boolean insert(Client client){
        if(client!=null){
            Optional<Client> clientFoundedByCpf = findByCpf(client);
            Optional<Client> clientFoundedByCns = findByCns(client);
            if(!clientFoundedByCpf.isPresent() || !clientFoundedByCns.isPresent()){
                clientRepository.save(client);
                return true;
            }
            return false;
        }
        return false;
    }

    @Transactional
    public boolean edit(Client client){
        if(client!=null){
            Optional<Client> clientFoundedByCpf = findByCpf(client);
            Optional<Client> clientFoundedByCns = findByCns(client);
            if(clientFoundedByCpf.isPresent() || !clientFoundedByCns.isPresent()){
                clientRepository.save(client);
                return true;
            }
            return false;
        }
        return false;
    }

    public Optional<Client> findByCpf(Client client){
        return clientRepository.findById(client.getCPF());
    }

    public Optional<Client> findByCns(Client client){
        return clientRepository.findById(client.getCns());
    }

    @Transactional
    public boolean remove(Client client){
        Optional<Client> clientFoundedByCpf = findByCpf(client);
        Optional<Client> clientFoundedByCns = findByCns(client);
        if(clientFoundedByCpf.isPresent() || clientFoundedByCns.isPresent()){
            clientRepository.delete(client);
            return true;
        }
        return false;
    }
}
