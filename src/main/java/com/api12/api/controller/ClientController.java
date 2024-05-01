package com.api12.api.controller;

import com.api12.api.Dto.ClientRequest;
import com.api12.api.Dto.ClientResponse;
import com.api12.api.Service.ClientService;
import com.api12.api.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    public ClientService getClientService() {
        return clientService;
    }
    @GetMapping("")
    public List<ClientResponse> getClients() {
        return clientService.findAll();
    }
    @PostMapping
    public ClientResponse save(ClientRequest clientresponse) {
        return clientService.save(clientresponse);
    }
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

}



