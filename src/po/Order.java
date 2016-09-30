package po;

/**
 * Created by DELL on 2016/9/27.
 */
public class Order {
    private int id;
    private String goodsName;
    private int goodsPrice;
    private int goodsNum;
    private String name;
    private String port;
    private String tel;
    private String date;
    private String state;
    private int context_id;
    private int money;

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getContext_id() {
        return context_id;
    }

    public void setContext_id(int context_id) {
        this.context_id = context_id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Order(int id, String goodsName, int goodsPrice, int goodsNum, String name, String port, String tel, String date, String state, int context_id, int money) {

        this.id = id;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.name = name;
        this.port = port;
        this.tel = tel;
        this.date = date;
        this.state = state;
        this.context_id = context_id;
        this.money = money;
    }
}
