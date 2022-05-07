package DesignPatterns.Delegation;

import java.util.List;

public final class ProductRepositoryImpl implements ProductRepository {
    @Override
    public void getRecommended(int id, FetchResult onCompletion) {
        if (id < 0)
            onCompletion.onFailure("Invalid Id");
        else
            onCompletion.onSuccess(List.of(new Product(1, "Macbook Pro 2018", 1000.0)));
    }

    @Override
    public void getSubCategory() {

    }
}

