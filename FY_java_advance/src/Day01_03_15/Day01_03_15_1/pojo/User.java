package Day01_03_15.Day01_03_15_1.pojo;

public class User {
    private String num;
    private String name;
    private String gender;
    private double money = 0;

    public User(String num, String name, String gender) {
        this.num = num;
        this.name = name;
        this.gender = gender;
    }

    public void moneyIn(double moneyIn) {
        money += moneyIn;
        System.out.println(name+" in "+moneyIn);
    }

    public void moneyOut(double moneyOut) {
        if (money >= moneyOut) {
            money -= moneyOut;
            System.out.println(name+" out "+moneyOut);
        } else {
            System.out.println("余额不足");
        }
    }

    public void pay(double moneyPay) {
        if (moneyPay <= 5000) {
            if (money >= moneyPay) {
                money -= moneyPay;
                System.out.println(name+" pay "+moneyPay);
            } else {
                System.out.println("余额不足");
            }
        }else{
            System.out.println("超过5000的转账限制");
        }
    }
    public void select(){
        System.out.println("编号:"+num+",姓名:"+name+",余额:"+money);
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
