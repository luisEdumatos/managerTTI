package com.managertti.dto.mapper;

import com.managertti.dto.request.WorkstationDTO;
import com.managertti.model.Workstation;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WorkstationMapper {
    WorkstationMapper INSTANCE = Mappers.getMapper(WorkstationMapper.class);

    Workstation toModel(WorkstationDTO workstationDTO);

    WorkstationDTO toDTO(Workstation workstation);
}
