package com.xworkz.showroombrand.repository;

import com.xworkz.showroombrand.dto.GiriasDTO;

import java.util.List;

public interface ShowroomRepository {
    public boolean addProduct(GiriasDTO dto);
    public GiriasDTO getProductInfoById(int id);
    public void updateQuantityInStockByProductId(int updatedQuantityInStock, int id);
    public List<GiriasDTO> findAll();
}
