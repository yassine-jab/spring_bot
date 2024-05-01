package com.api12.api.Service;


import com.api12.api.Dto.ClientRequest;
import com.api12.api.Dto.ClientResponse;

import java.util.List;

public interface ClientService {
ClientResponse save(ClientRequest clientreqest);
ClientResponse findById(int id);
ClientResponse findByNom(String nom);
void delete(int id);
ClientResponse update(ClientRequest clientreqest,int id);
List<ClientResponse> findAll();
}
