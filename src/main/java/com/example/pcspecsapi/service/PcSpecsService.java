package com.example.pcspecsapi.service;

import com.example.pcspecsapi.model.PcSpecs;
import com.example.pcspecsapi.repository.PcSpecsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class PcSpecsService {
    @Autowired
    PcSpecsRepository pcSpecsRepository;

    public List<PcSpecs> getAllSpecs() {
        List<PcSpecs> pcSpecs = new ArrayList<>();
        pcSpecsRepository.findAll().forEach(pcSpec -> pcSpecs.add(pcSpec));
        return pcSpecs;
    }

    public PcSpecs getPcSpecsById(int id) {
        return pcSpecsRepository.findById(id).get();
    }

    public void createPcSpecs(PcSpecs pcSpecs) {
        pcSpecsRepository.save(pcSpecs);
    }

    public void deletePcSpecs(int id) {
        pcSpecsRepository.deleteById(id);
    }
}
