package com.koc.tema_back.tema.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TemaService {
    private final TemaRepository repository;
    private final TemaMapper temaMapper;

    public void save(TemaDto temaDto) {
        repository.save(temaMapper.dtoToEntity(temaDto));
    }

    public TemaDto findById(long id) {
        return temaMapper.entityToDto(repository.findById(id).get());
    }
}
