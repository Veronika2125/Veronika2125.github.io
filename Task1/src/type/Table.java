/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package type;

/**
 *
 * @author Вероника
 */
public class Table {
    private double price;
    private double razmer;
    private String name;
    private String Ispol;
    private String Otvet;
    private String Ysluga;
    private String Tarif;
    
    public Table() {
        this.name = "";
        this.Ispol = "";
        this.Otvet = "";
        this.Ysluga = "";
        this.Tarif = "";
        this.razmer = 0;
        this.price = 0;
    }

    public Table( String name, String Ysluga,  String Tarif, double razmer, String Ispol, String Otvet, double price) {
        this.price = price;
        this.razmer = razmer;
        this.name = name;
        this.Ispol = Ispol;
        this.Otvet = Otvet;
        this.Ysluga = Ysluga;
        this.Tarif = Tarif;
    }

    public String getIspol() {
        return Ispol;
    }

    public void setIspol(String Ispol) {
        this.Ispol = Ispol;
    }

    public String getOtvet() {
        return Otvet;
    }

    public void setOtvet(String Otvet) {
        this.Otvet = Otvet;
    }

    public String getYsluga() {
        return Ysluga;
    }

    public void setYsluga(String Ysluga) {
        this.Ysluga = Ysluga;
    }

    public String getTarif() {
        return Tarif;
    }

    public void setTarif(String Tarif) {
        this.Tarif = Tarif;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRazmer() {
        return razmer;
    }

    public void setRazmer(double razmer) {
        this.razmer = razmer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
