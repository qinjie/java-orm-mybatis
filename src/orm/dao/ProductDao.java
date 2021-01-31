package orm.dao;

import orm.MyBatisFactory;
import orm.mapper.ProductMapper;
import orm.model.Product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ProductDao implements ProductMapper {

    SqlSessionFactory sqlSessionFactory = null;

    public ProductDao(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public ProductDao() {
        // create SqlSessionFactory
        this.sqlSessionFactory = MyBatisFactory.GetSqlSessionFactory();
        System.out.println(sqlSessionFactory.toString());
    }

    @Override
    public List<Product> selectAll() {
        List<Product> list = null;
        try (SqlSession session = this.sqlSessionFactory.openSession()) {
            list = session.selectList("mapper.ProductMapper.selectAll");
        }
        return list;
    }

    @Override
    public int insert(Product Product) {
        int count = 0;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            count = session.insert("mapper.ProductMapper.insert", Product);
            session.commit();
        }
        return count;
    }

    @Override
    public int deleteByPrimaryKey(Integer productId) {
        int count = 0;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            count = session.delete("mapper.ProductMapper.deleteByPrimaryKey", productId);
            session.commit();
        }
        return count;
    }

    @Override
    public Product selectByPrimaryKey(Integer productid) {
        Product Product = null;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            Product = session.selectOne("mapper.ProductMapper.selectByPrimaryKey", productid);
        }
        return Product;
    }

    @Override
    public int updateByPrimaryKey(Product record) {

        int count = 0;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            count = session.update("mapper.ProductMapper.updateByPrimaryKey", record);
            session.commit();
        }
        return count;
    }

}
