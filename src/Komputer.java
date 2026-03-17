import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Komputer {

private String namaPc;
private int durasiJam;
private double tarifPerJam;
private String status;


// Constructor overloading
public Komputer(String namaPc) {
this(namaPc, 0, 5000);
}


public Komputer(String namaPc, int durasiJam, double tarifPerJam) {
this.namaPc = namaPc;
this.durasiJam = durasiJam;
this.tarifPerJam = tarifPerJam;
this.status = durasiJam > 0 ? "In Use" : "Available";
}


// Method overloading
public void tambahJam(int jam) {
this.durasiJam += jam;
this.status = "In Use";
}


public void tambahJam(int jam, boolean bonus) {
this.durasiJam += bonus ? jam + 1 : jam;
this.status = "In Use";
}


public double hitungBiaya() {
return durasiJam * tarifPerJam;
}


public void reset() {
durasiJam = 0;
status = "Available";
}


public String getNamaPc() { return namaPc; }
public int getDurasiJam() { return durasiJam; }
public String getStatus() { return status; }
}

