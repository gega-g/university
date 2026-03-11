package infrastructure;

public class Laboratory {
    private String name;
    private String equipmentType;

    public Laboratory(String name, String equipment) {
        this.name = name;
        this.equipmentType = equipment;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}