package com.managertti.service;

import com.managertti.dto.mapper.ClientMapper;
import com.managertti.dto.request.ClientDTO;
import com.managertti.model.Client;
import com.managertti.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    private final ClientMapper clientMapper = ClientMapper.INSTANCE;

    public Page<ClientDTO> listAll(Pageable page) {
        Page<Client> pageClient = clientRepository.findAll(page);
        return pageClient.map(clientMapper::toDTO);
    }
}
