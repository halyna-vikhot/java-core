package hw2.task2.models;

public class WorkStation extends Laptop {
    private String Photo;

    public WorkStation() {
    }

    public WorkStation(String photo) {
        Photo = photo;
    }

    public WorkStation(int CPUs, int RAM, double monitor, int weight, String photo) {
        super(CPUs, RAM, monitor, weight);
        Photo = photo;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    @Override
    public String toString() {
        return "WorkStation{" +
                "Photo='" + Photo + '\'' +
                "} " + super.toString();
    }
}
