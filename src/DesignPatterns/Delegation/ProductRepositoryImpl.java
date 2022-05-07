package DesignPatterns.Delegation;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public void getRecommended() {
        System.out.println("Fetched!!!");
    }

    @Override
    public void getSubCategory() {

    }
}

