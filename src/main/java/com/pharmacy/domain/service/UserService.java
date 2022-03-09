package com.pharmacy.domain.service;

import com.pharmacy.domain.entities.Remedy;
import com.pharmacy.domain.entities.User;
import com.pharmacy.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public boolean insert(User user){
        if(user!=null){
            Optional<User> userFounded = findByCpf(user);
            if(!userFounded.isPresent()){
                userRepository.save(user);
                return true;
            }
            return false;
        }
        return false;
    }

    @Transactional
    public boolean edit(User user){
        if(user!=null){
            Optional<User> userFounded = findByCpf(user);
            if(userFounded.isPresent()){
                userRepository.save(user);
                return true;
            }
            return false;
        }
        return false;
    }

    public Optional<User> findByCpf(User user){
        if(user != null){
            return userRepository.findById(user.getCPF());
        }
        return Optional.empty();
    }

    @Transactional
    public boolean remove(User user){
        if(user!=null){
            Optional<User> userFounded = findByCpf(user);
            if(userFounded.isPresent()){
                userRepository.delete(user);
                return true;
            }
            return false;
        }
        return false;
    }
}
