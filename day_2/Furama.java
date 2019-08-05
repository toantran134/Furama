package Practices.day_2;

public class Furama {
    private String[] nameVilla = {"Villa1", "Villa2", "Villa3", "Villa4", "Villa5"};
    private String[] nameHouse = {"BeachHouse1", "BeachHouse2"};

    public Furama() {
    }

    public void setNameVilla(String[] nameVilla, String[] nameHouse) {
        this.nameVilla = nameVilla;
        this.nameHouse = nameHouse;
    }

    public String[] getNameVilla() {
        return nameVilla;
    }

    public String[] getNameHouse() {
        return nameHouse;
    }
}
