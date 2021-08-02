package com.managertti.resource;

import com.managertti.dto.request.ClientDTO;
import com.managertti.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/clients")
public class ClientResource {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public Page<ClientDTO> listAll(Pageable page) {
        return clientService.listAll(page);
    }
}
