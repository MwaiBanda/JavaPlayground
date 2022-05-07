package DesignPatterns.Delegation;

public class ProductService {
    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void fetchRecommended(){
        productRepository.getRecommended();
    }

}
