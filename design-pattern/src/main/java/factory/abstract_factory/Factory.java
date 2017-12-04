package factory.abstract_factory;

/**
 * Created by mengfw on 2017/11/29.
 */
public interface Factory<P extends Product>{
    Product  createProduct();
}
