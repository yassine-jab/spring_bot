package com.api12.api.Service;

import com.api12.api.Dao.ClientDao;
import com.api12.api.Dto.ClientRequest;
import com.api12.api.Dto.ClientResponse;
import com.api12.api.entity.Client;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public  class ClientServiceImpl implements ClientService {
    private ModelMapper modelMapper;
    private ClientDao clientDao;

    public ClientServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.clientDao=clientDao;
    }

    @Override
    public ClientResponse save(ClientRequest clientRequest) {
      Client client = modelMapper.map(clientRequest, Client.class);
      Client saved=clientDao.save(client);
      return modelMapper.map(saved, ClientResponse.class);
    }

    @Override
    public ClientResponse findById(int id) {
Client client = clientDao.findById(id).orElseThrow(()-> new RuntimeException("Client not found"));
    return modelMapper.map(client, ClientResponse.class);}

    @Override
    public ClientResponse findByNom(String nom) {
        Client client = clientDao.findByName(nom);
        return modelMapper.map(client, ClientResponse.class);
    }

    @Override
    public void delete(int id) {
clientDao.deleteById(id);
Client client = clientDao.findById(id).orElseThrow(()-> new RuntimeException("Client not found"));
    }

    @Override
    public ClientResponse update(ClientRequest clientreqest, int id) {
Optional client=clientDao.findById(id);
    if(client.isPresent()){
    Client client1=modelMapper.map(clientreqest,Client.class);
    clientDao.save(client1);
    client1.setId(id);
    Client updated=modelMapper.map(client1,Client.class);
    return modelMapper.map(updated,ClientResponse.class);}
    else {
        throw new RuntimeException("Client not found");
    }
    }

    @Override
    public List<ClientResponse> findAll() {
        return clientDao.findAll().stream().map(el->modelMapper.map(el,ClientResponse.class)).collect(Collectors.toList());
    }
}
