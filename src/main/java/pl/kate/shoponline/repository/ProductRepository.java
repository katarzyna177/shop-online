package pl.kate.shoponline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kate.shoponline.entity.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
    Optional<Product> findById(Integer id);
    List<Product> findAll();
    Product save(Product entity);



}
