package org.asalih;

import org.asalih.models.Building;
import org.asalih.models.House;
import org.asalih.models.SummerHouse;
import org.asalih.models.Villa;
import org.asalih.service.BuildingService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Building> buildings = List.of(
                new House(1_000_000, 100, 3, 1),
                new House(900_000, 90, 3, 2),
                new House(1_250_000, 110, 3, 1),
                new Villa(15_000_000, 180, 6, 2),
                new Villa(12_500_000, 200, 6, 3),
                new Villa(10_250_000, 200, 5, 2),
                new SummerHouse(3_000_000, 150, 3, 1),
                new SummerHouse(5_000_000, 140, 4, 2),
                new SummerHouse(6_000_000, 180, 5, 2)
        );

        BuildingService buildingService = new BuildingService(buildings);

        System.out.println("Houses: " + buildingService.getBuildings(House.class));
        System.out.println("Villas: " + buildingService.getBuildings(Villa.class));
        System.out.println("Summer houses: " + buildingService.getBuildings(SummerHouse.class));

        System.out.println("Total price of houses: " + buildingService.totalHousingPrice(House.class));
        System.out.println("Total price of villas: " + buildingService.totalHousingPrice(Villa.class));
        System.out.println("Total price of summer houses: " + buildingService.totalHousingPrice(SummerHouse.class));
        System.out.println("Total price of all buildings: " + buildingService.totalHousingPrice());

        System.out.println("Average square meters of houses: " + buildingService.averageMeterSquare(House.class));
        System.out.println("Average square meters of villas: " + buildingService.averageMeterSquare(Villa.class));
        System.out.println("Average square meters of summer houses: " + buildingService.averageMeterSquare(SummerHouse.class));
        System.out.println("Average square meters of all buildings: " + buildingService.averageMeterSquare());

        System.out.println("Buildings with 3 rooms and 1 living rooms: " + buildingService.filterBuildingsByRoomCounts(3, 1));
        System.out.println("Buildings with 5 rooms and 2 living rooms: " + buildingService.filterBuildingsByRoomCounts(5, 2));
    }
}