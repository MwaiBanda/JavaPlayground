package DesignPatterns.Delegation;

import java.util.List;

public interface ProductRepository {
    public void getRecommended(int id, FetchResult onCompletion);
    public void getSubCategory();

    interface FetchResult {
        public void onSuccess(List<Product> products);
        public void onFailure(String error);
    }
}
