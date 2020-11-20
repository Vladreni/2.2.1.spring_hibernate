package hiber.model;

import javax.persistence.*;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private Long id;

    @Column
    private String model;

    @Column
    private int series;

//    private User user;
//
//    //@OneToOne(cascade = CascadeType.ALL, mappedBy = "car")
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public Car() {

    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return  "model: '" + model + '\'' +
                ", series: " + series;
    }
}
