package com.managertti.dto.mapper;


import com.managertti.dto.request.ClientDTO;
import com.managertti.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    Client toModel(ClientDTO clientDTO);

    ClientDTO toDTO(Client client);
}
