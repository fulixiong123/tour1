package dao;

import po.Context;
import po.Order;
import po.Type;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/26.
 */
public class DaoImpl implements Tour {

    private String url = "jdbc:mysql://192.168.1.118/tour";
    private String username = "root";
    private String password = "fozzz";

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delContext(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM tour_context WHERE id=?";
        try {
            conn = DriverManager.getConnection(url, username, password);

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void addContext(Context context) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement("INSERT INTO tour_context(type_id,title,date,context,pic)VALUES (?,?,?,?,?)");
            ps.setInt(1, context.getType_id());
            ps.setString(2, context.getTitle());
            ps.setInt(3, context.getDate());
            ps.setString(4, context.getContext());
            ps.setString(5, context.getPic());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public List<Context> getContext(int num, int tp_id) {
        List<Context> cts = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "SELECT * FROM tour_context WHERE type_id=? ORDER BY date DESC LIMIT " + num;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, tp_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                int type_id = rs.getInt(2);
                String title = rs.getString(3);
                int date = rs.getInt(4);
                String context = rs.getString(5);
                String pic = rs.getString(6);
                Context ct = new Context(id, type_id, title, date, context, pic);
                cts.add(ct);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return cts;
    }

    @Override
    public void editContext(Context context) {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement("update tour_context set id=?,type_id=?,title=?,date=?,context=?,pic=? where id=?");
            ps.setInt(1, context.getId());
            ps.setInt(2, context.getType_id());
            ps.setString(3, context.getTitle());
            ps.setInt(4, context.getDate());
            ps.setString(5, context.getContext());
            ps.setString(6, context.getPic());
            ps.setInt(7, context.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public Context getContextById(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        Context ct=new Context();
        String sql = "SELECT * FROM tour_context WHERE id=?";
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int c_id = rs.getInt(1);
                int type_id = rs.getInt(2);
                String title = rs.getString(3);
                int date = rs.getInt(4);
                String context = rs.getString(5);
                String pic = rs.getString(6);
                ct = new Context(c_id, type_id, title, date, context, pic);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return ct;
    }

    @Override
    public void delType(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM tour_type WHERE id=?";
        try {
            conn = DriverManager.getConnection(url, username, password);

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void addType(Type type) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement("INSERT INTO tour_type(id,context)VALUES (?,?)");
            ps.setInt(1, type.getId());
            ps.setString(2, type.getContext());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public Type getType(int tid) {
        Type type=new Type();
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "SELECT * FROM tour_type WHERE id=? ";
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, tid);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int id = rs.getInt(1);
            String context = rs.getString(2);
            type = new Type(id, context);
            return type;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return type;
    }

    @Override
    public void editType(Type type) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement("update tour_type set id=?,context=? where id=?");
            ps.setInt(1, type.getId());
            ps.setString(2, type.getContext());
            ps.setInt(3, type.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Order> getOrdering() {
        List<Order> orders = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        String s="ing";
        String sql = "SELECT * FROM tour_order o,tour_context c WHERE o.context_id=c.id AND o.state='"+s+"'";
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement(sql);

//            ps.setString(1,s);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                int goodsNum=rs.getInt(2);
                String name = rs.getString(3);
                String port=rs.getString(4);
                String tel = rs.getString(5);
                String date = rs.getString(6);
                String state=rs.getString(7);
                int context_id=rs.getInt(8);
                String goodsName=rs.getString(11);
                int goodsPrice=rs.getInt(12);
                int money=goodsPrice*goodsNum;
                Order order=new Order(id,goodsName,goodsPrice,goodsNum,name,port,tel,date,state,context_id,money);
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return orders;
    }

    @Override
    public List<Order> getOrdered() {
        List<Order> orders = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        String s="ed";
        String sql = "SELECT * FROM tour_order o,tour_context c WHERE o.context_id=c.id AND o.state='"+s+"'" ;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement(sql);
//            ps.setString(1,"ed");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                int goodsNum=rs.getInt(2);
                String name = rs.getString(3);
                String port=rs.getString(4);
                String tel = rs.getString(5);
                String date = rs.getString(6);
                String state=rs.getString(7);
                int context_id=rs.getInt(8);
                String goodsName=rs.getString(11);
                int goodsPrice=rs.getInt(12);
                int money=goodsPrice*goodsNum;
                Order order=new Order(id,goodsName,goodsPrice,goodsNum,name,port,tel,date,state,context_id,money);                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return orders;
    }

    @Override
    public void addOrder(Order order) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement("INSERT INTO tour_order(num,name,port,tel,date,state,context_id)VALUES (?,?,?,?,?,?,?)");

            ps.setInt(1,order.getGoodsNum());
            ps.setString(2, order.getName());
            ps.setString(3,order.getPort());
            ps.setString(4, order.getTel());
            ps.setString(5, order.getDate());
            ps.setString(6, order.getState());
            ps.setInt(7,order.getContext_id());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void delOrder(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "DELETE FROM tour_order WHERE id=?";
        try {
            conn = DriverManager.getConnection(url, username, password);

            ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void editOrder(Order order) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement("update tour_order set id=?,num=?,name=?,port=?,tel=?,date=?,state=?,context_id=? where id=?");
            ps.setInt(1, order.getId());
            ps.setInt(2,order.getGoodsNum());
            ps.setString(3, order.getName());
            ps.setString(4,order.getPort());
            ps.setString(5,order.getTel());
            ps.setString(6, order.getDate());
            ps.setString(7, order.getState());
            ps.setInt(8,order.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Order geteditOrder(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        Order order=new Order();
        String sql = "SELECT * FROM tour_order o,tour_context c WHERE o.context_id=c.id AND o.id=?";
        try {
            conn = DriverManager.getConnection(url, username, password);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int goodsNum=rs.getInt(2);
                String name = rs.getString(3);
                String port=rs.getString(4);
                String tel = rs.getString(5);
                String date = rs.getString(6);
                String state=rs.getString(7);
                int context_id=rs.getInt(8);
                String goodsName=rs.getString(11);
                int goodsPrice=rs.getInt(12);
                int money=goodsPrice*goodsNum;
                order=new Order(id,goodsName,goodsPrice,goodsNum,name,port,tel,date,state,context_id,money);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return order;
    }
    @Override
    public void finishOrder(int id) {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "UPDATE tour_order SET state=? WHERE id=?";
        try {
            conn = DriverManager.getConnection(url, username, password);

            ps = conn.prepareStatement(sql);

            ps.setString(1,"ed");
            ps.setInt(2,id);

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Tour tour = new DaoImpl();
//        try {
//            tour.delContext(1);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        tour.addContext(new Context(1,1,"新闻标题",20160926,"内容","F://1.gif"));
//        List<Context>list=tour.getContext(3);
//        System.out.println(list.get(0).getId());
//        tour.delContext(1);
//        tour.editContext(new Context(2,1,"xwbt",20160928,"内容","C://"));
//        System.out.println(tour.getType(1).getContext());
//        tour.editType(new Type(2,"公告"));
//         tour.addType(new Type(3,"路线"));
        System.out.println(tour.getOrdered().get(0));
    }
}
