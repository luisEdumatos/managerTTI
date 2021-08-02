package com.managertti.resource;

import com.managertti.dto.request.WorkstationDTO;
import com.managertti.service.WorkstationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("workstations")
public class WorkstationResource {

    @Autowired
    private WorkstationService workstationService;

    @GetMapping
    public Page<WorkstationDTO> listAll(Pageable page) {
        return workstationService.listAll(page);
    }
}
