
import java.util.List;
import orm.dao.ProductDao;
import orm.model.Product;

public class App {

    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();

        Product p1 = new Product("AP", "Apple", 999, 1.0);
        productDao.insert(p1);

        p1.setName("ApplePear");
        productDao.updateByPrimaryKey(p1);
        productDao.deleteByPrimaryKey(p1.getProductid());

        Product p2 = new Product("BA", "Banana", 888, 2.0);
        productDao.insert(p2);

        List<Product> list = productDao.selectAll();
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
