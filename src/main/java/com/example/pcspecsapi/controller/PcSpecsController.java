package com.example.pcspecsapi.controller;

import com.example.pcspecsapi.model.PcSpecs;
import com.example.pcspecsapi.service.PcSpecsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pcSpecs")
public class PcSpecsController {
    @Autowired
    PcSpecsService pcSpecsService;

    @GetMapping("/{id}")
    PcSpecs getPcSpecsById(@PathVariable int id) {
        return pcSpecsService.getPcSpecsById(id);
    }

    @GetMapping()
    List<PcSpecs> getAllPcSpecsById() {
        return pcSpecsService.getAllSpecs();
    }

    @PostMapping()
    void createPcSpecs(@RequestBody PcSpecs pcSpecs) {
        pcSpecsService.createPcSpecs(pcSpecs);
    }

    @DeleteMapping("/{id}")
    void deletePcSpecsById(@PathVariable int id) {
        pcSpecsService.deletePcSpecs(id);
    }
}
