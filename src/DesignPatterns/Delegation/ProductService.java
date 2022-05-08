package DesignPatterns.Delegation;

import javax.inject.Inject;
import java.util.List;

public final class ProductService {
     @Inject ProductRepository productRepository;

    @Inject
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void fetchRecommended(int id){
        productRepository.getRecommended(id, new ProductRepository.FetchResult() {
            @Override
            public void onSuccess(List<Product> products) {
                System.out.println(products);
            }

            @Override
            public void onFailure(String error) {
                System.out.println(error);
            }
        });
    }

}
