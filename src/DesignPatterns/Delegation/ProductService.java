package DesignPatterns.Delegation;

import java.util.List;

public final class ProductService {
    private ProductRepository productRepository;
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
