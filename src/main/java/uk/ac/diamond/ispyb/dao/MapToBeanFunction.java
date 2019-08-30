package uk.ac.diamond.ispyb.dao;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.function.Function;

public class MapToBeanFunction<T> implements Function<Map<String,Object>, T>{
    private Class<T> beanClass;

    public MapToBeanFunction(Class<T> beanClass){
        this.beanClass = beanClass;
        BeanUtilsBean.getInstance().getConvertUtils().register(false, false, 0);
    }

    @Override
    public T apply(Map<String, Object> map) {
        try{
            T bean = beanClass.newInstance();
            BeanUtils.populate(bean, map);
            clean(bean, map);
            return bean;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException | NoSuchMethodException e) {
            String message = String.format("could not populate bean of type %s using map %s", beanClass.toString(), map.toString());
            throw new RuntimeException(message, e);
        }
    }

    /**
     * BeanUtils maps nulls to Integer(0), etc. which is incorrect. There is a method of suppling our own converters
     * but unfortunately the osgi bundle doesn't allow you to do this so correcting after the fact.
     */
    private void clean(T bean, Map<String, Object> map) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        for (Map.Entry<String, Object> entry: map.entrySet()){
            if (entry.getValue() == null && PropertyUtils.isWriteable(bean, entry.getKey())){
                PropertyUtils.setProperty(bean, entry.getKey(), null);
            }
        }
    }
}
