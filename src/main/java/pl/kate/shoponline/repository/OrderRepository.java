package pl.kate.shoponline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kate.shoponline.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
