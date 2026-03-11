package infrastructure;

public class Building {
    private String buildingName;

    public Building(String name) {
        this.buildingName = name;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
}