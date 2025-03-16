package org.springframework.samples.system.mapper;

import org.mapstruct.Mapper;
import org.springframework.samples.system.model.Specialty;
import org.springframework.samples.system.rest.dto.SpecialtyDto;

import java.util.Collection;

/**
 * Map Specialty & SpecialtyDto using mapstruct
 */
@Mapper
public interface SpecialtyMapper {
    Specialty toSpecialty(SpecialtyDto specialtyDto);

    SpecialtyDto toSpecialtyDto(Specialty specialty);

    Collection<SpecialtyDto> toSpecialtyDtos(Collection<Specialty> specialties);

    Collection<Specialty> toSpecialtys(Collection<SpecialtyDto> specialties);

}
