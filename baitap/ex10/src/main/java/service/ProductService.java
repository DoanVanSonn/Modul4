package service;

import model.Product;
import org.springframework.stereotype.Service;
import repository.IProductRepository;

import java.util.List;

@Service
public class ProductService implements IProductService {
private IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
}
