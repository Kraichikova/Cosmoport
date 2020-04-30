package com.space.service;

import com.space.model.Ship;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface ShipService {
    Page<Ship> getShipsList(Specification<Ship> specification, Pageable sortedByName);

    List<Ship> getShipsList(Specification<Ship> specification);

    Ship createShip(Ship requestShip);

    Ship getShip(Long id);

    Ship updateShip(Long id, Ship ship);

    void deleteShip(Long id);

    Long checkId (String id);

}
