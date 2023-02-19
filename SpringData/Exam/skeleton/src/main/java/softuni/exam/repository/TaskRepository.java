package softuni.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.exam.models.entity.Task;
import softuni.exam.models.entity.enums.CarType;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

        Optional<Task> findFirstByCar_Id(Long id);

        Optional<List<Task>> findAllByCar_CarTypeOrderByPriceDesc(CarType typeCar);

}
