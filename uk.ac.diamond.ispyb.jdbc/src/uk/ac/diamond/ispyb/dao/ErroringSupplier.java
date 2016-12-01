package uk.ac.diamond.ispyb.dao;

import org.springframework.dao.DataAccessException;

public interface ErroringSupplier<T>{
   T get() throws DataAccessException;
}
