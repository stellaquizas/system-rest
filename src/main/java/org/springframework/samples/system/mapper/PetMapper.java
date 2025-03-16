package org.springframework.samples.system.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.samples.system.model.Pet;
import org.springframework.samples.system.model.PetType;
import org.springframework.samples.system.rest.dto.PetDto;
import org.springframework.samples.system.rest.dto.PetFieldsDto;
import org.springframework.samples.system.rest.dto.PetTypeDto;

import java.util.Collection;

/**
 * Map Pet & PetDto using mapstruct
 */
@Mapper(uses = VisitMapper.class)
public interface PetMapper {

    @Mapping(source = "owner.id", target = "ownerId")
    PetDto toPetDto(Pet pet);

    Collection<PetDto> toPetsDto(Collection<Pet> pets);

    Collection<Pet> toPets(Collection<PetDto> pets);

    @Mapping(source = "ownerId", target = "owner.id")
    Pet toPet(PetDto petDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "owner", ignore = true)
    @Mapping(target = "visits", ignore = true)
    Pet toPet(PetFieldsDto petFieldsDto);

    PetTypeDto toPetTypeDto(PetType petType);

    PetType toPetType(PetTypeDto petTypeDto);

    Collection<PetTypeDto> toPetTypeDtos(Collection<PetType> petTypes);
}
