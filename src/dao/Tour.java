package dao;

import po.Context;
import po.Order;
import po.Type;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/26.
 */
public interface Tour {
    public void delContext(int id) throws SQLException;
    public void addContext(Context context);
    public List<Context> getContext(int num, int type_id);
    public void editContext(Context context);
    public Context getContextById(int id);

    public List<Order> getOrdering();
    public List<Order> getOrdered();
    public void addOrder(Order order);
    public void delOrder(int id);
    public void editOrder(Order order);
    public void finishOrder(int id);
    public Order geteditOrder(int id);

    public void delType(int id);
    public void addType(Type type);
    public Type getType(int id);
    public void editType(Type type);
}
