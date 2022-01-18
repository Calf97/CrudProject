package com.example.demo.clienteRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Client;



@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
