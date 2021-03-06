package orm.mapper;

import java.util.List;
import orm.model.Product;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table product
     *
     * @mbg.generated Sun Jan 31 22:17:46 SGT 2021
     */
    int deleteByPrimaryKey(Integer productid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table product
     *
     * @mbg.generated Sun Jan 31 22:17:46 SGT 2021
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table product
     *
     * @mbg.generated Sun Jan 31 22:17:46 SGT 2021
     */
    Product selectByPrimaryKey(Integer productid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table product
     *
     * @mbg.generated Sun Jan 31 22:17:46 SGT 2021
     */
    List<Product> selectAll();

    /**
     * This method was generated by MyBatis Generator. This method corresponds to
     * the database table product
     *
     * @mbg.generated Sun Jan 31 22:17:46 SGT 2021
     */
    int updateByPrimaryKey(Product record);
}