package softuni.exam.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task extends BaseEntity{

    //positive
    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private LocalDateTime date;

    @ManyToOne
    private Part part;

    @ManyToOne
    private Mechanic mechanic;

    @ManyToOne
    private Car car;

    @Override
    public String toString() {

        return String.format("Car - %s %s with %dkm", car.getCarMake(), car.getCarModel(), car.getKilometers()) + System.lineSeparator() +
                String.format("-Mechanic: %s %s - task №%d:¬¬", mechanic.getFirstName(), mechanic.getLastName(), this.getId()) + System.lineSeparator() +
                String.format("--Engine: %s", car.getEngine()) + System.lineSeparator() +
                String.format("---Price: %.2f$", this.getPrice());

    }

}
