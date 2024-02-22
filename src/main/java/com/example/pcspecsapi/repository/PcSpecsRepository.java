package com.example.pcspecsapi.repository;

import com.example.pcspecsapi.model.PcSpecs;
import org.springframework.data.repository.CrudRepository;

public interface PcSpecsRepository extends CrudRepository<PcSpecs, Integer> {
}
