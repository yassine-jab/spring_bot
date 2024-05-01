package com.api12.api.Dao;

import com.api12.api.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Integer> {
Client findByName(String name);
}
