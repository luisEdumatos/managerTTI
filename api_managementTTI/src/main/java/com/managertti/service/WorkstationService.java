package com.managertti.service;

import com.managertti.dto.mapper.WorkstationMapper;
import com.managertti.dto.request.WorkstationDTO;
import com.managertti.model.Workstation;
import com.managertti.repository.WorkstationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class WorkstationService {

    @Autowired
    private WorkstationRepository workstationRepository;

    private final WorkstationMapper workstationMapper = WorkstationMapper.INSTANCE;

    public Page<WorkstationDTO> listAll(Pageable page) {
        Page<Workstation> pageWorkstation = workstationRepository.findAll(page);
        return pageWorkstation.map(workstationMapper::toDTO);
    }
}
