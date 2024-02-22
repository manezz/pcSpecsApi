package com.example.pcspecsapi.model;

import jakarta.persistence.*;

import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table
public class PcSpecs {
    private final static AtomicInteger idGenerator =
            new AtomicInteger(0);
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String cpu;
    @Column(nullable = true)
    private String gpu;
    @Column(nullable = true)
    private String ram;
    @Column(nullable = true)
    private String ssd;
    @Column(nullable = true)
    private String psu;
    @Column(nullable = true)
    private String mb;
    public PcSpecs(){id = idGenerator.incrementAndGet(); }

    public int getId() {return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCpu() { return cpu; }
    public void setCpu(String cpu) { this.cpu = cpu; }
    public String getGpu() { return gpu; }
    public void setGpu(String gpu) { this.gpu = gpu; }
    public String getRam() { return ram; }
    public void setRam(String ram) { this.ram = ram; }
    public String getSsd() { return ssd; }
    public void setSsd(String ssd) { this.ssd = ssd; }
    public String getPsu() { return psu; }
    public void setPsu(String psu) { this.psu = psu; }
    public String getMb() { return mb; }
    public void setMb(String mb) { this.mb = mb; }
}
