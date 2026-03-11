package infrastructure;

import people.Lecturer;
import people.SecurityGuard;

public class University {
    private String uniName;
    private Building[] buildings;
    private Lecturer[] lecturers;
    private SecurityGuard[] guards;

    public University(String uniName, Building[] buildings, Lecturer[] lecturers, SecurityGuard[] guards) {
        this.uniName = uniName;
        this.buildings = buildings;
        this.lecturers = lecturers;
        this.guards = guards;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

    public Lecturer[] getLecturers() {
        return lecturers;
    }

    public void setLecturers(Lecturer[] lecturers) {
        this.lecturers = lecturers;
    }

    public SecurityGuard[] getGuards() {
        return guards;
    }

    public void setGuards(SecurityGuard[] guards) {
        this.guards = guards;
    }
}