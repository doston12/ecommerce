package sample.dao;

import sample.model.Salesman;

import java.util.List;

public interface SalesmanDao {

    Salesman findSalesmanById(Integer id) throws Exception;

    void insertSalesman(Salesman salesman) throws Exception;

    void deleteSalesman(Integer id) throws Exception;

    void updateSalesman(Salesman salesman) throws Exception;

    List<Salesman> findAllSalesmans() throws Exception;
}
