package org.springframework.samples.system.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.samples.system.model.Vet;
import org.springframework.samples.system.rest.dto.VetDto;
import org.springframework.samples.system.rest.dto.VetFieldsDto;

import java.util.Collection;

/**
 * Map Vet & VetoDto using mapstruct
 */
@Mapper(uses = SpecialtyMapper.class)
public interface VetMapper {
    Vet toVet(VetDto vetDto);

    @Mapping(target = "id", ignore = true)
    Vet toVet(VetFieldsDto vetFieldsDto);

    VetDto toVetDto(Vet vet);

    Collection<VetDto> toVetDtos(Collection<Vet> vets);
}
