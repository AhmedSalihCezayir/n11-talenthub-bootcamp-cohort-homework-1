package org.asalih.service;

import org.asalih.models.Building;
import org.asalih.models.House;

import java.util.List;

public class BuildingService {
    private final List<Building> buildings;

    public BuildingService(List<Building> buildings) {
        this.buildings = buildings;
    }

    public double totalHousingPrice(Class<? extends Building> buildingType) {
        return buildings.stream()
                .filter(buildingType::isInstance)
                .mapToDouble(Building::getPrice)
                .sum();
    }

    public double totalHousingPrice() {
        return buildings.stream().mapToDouble(Building::getPrice).sum();
    }

    public double averageMeterSquare(Class<? extends Building> buildingType) {
        return buildings.stream()
                .filter(buildingType::isInstance)
                .mapToDouble(Building::getMeterSquare)
                .average()
                .orElse(0);
    }

    public double averageMeterSquare() {
        return buildings.stream()
                .mapToDouble(Building::getMeterSquare)
                .average()
                .orElse(0);
    }

    public List<Building> filterBuildingsByRoomCounts(int rooms, int livingRooms) {
        return buildings.stream()
                .filter(building -> building.getRooms() == rooms && building.getLivingRooms() == livingRooms)
                .toList();
    }

    public List<Building> getBuildings(Class <? extends Building> buildingType) {
        return buildings.stream()
                .filter(buildingType::isInstance)
                .toList();
    }
}
