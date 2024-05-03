package com.xworkz.showroombrand.service;

import com.xworkz.showroombrand.dto.GiriasDTO;

import java.util.List;

public interface ShowroomService {
    public boolean validateProductAndAdd(GiriasDTO dto);
    public GiriasDTO getProductInfoById(int id);
    public List<GiriasDTO> findAll();
}
