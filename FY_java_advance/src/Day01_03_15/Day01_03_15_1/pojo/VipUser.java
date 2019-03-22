package Day01_03_15.Day01_03_15_1.pojo;

public class VipUser extends User{
    private int jifen;

    public VipUser(String num, String name, String gender,int jifen) {
        super(num, name, gender);
        this.jifen = jifen;
    }

    @Override
    public void moneyIn(double moneyIn) {
        super.moneyIn(moneyIn);
        jifen += (int)(moneyIn/10);
    }

    public int getJifen() {
        return jifen;
    }

    public void setJifen(int jifen) {
        this.jifen = jifen;
    }

    @Override
    public void pay(double moneyPay) {
        if (moneyPay <= 20000) {
            if (this.getMoney() >= moneyPay) {
                this.setMoney(this.getMoney()-moneyPay);
            } else {
                System.out.println("余额不足");
            }
        }else{
            System.out.println("超过20000的转账限制");
        }
    }

    public void change(){
        if(jifen <= 100){
            System.out.println("baozhen");
        }else if(jifen <=1000){
            System.out.println("shubiao");
        }else{
            System.out.println("shouji");
        }
    }

    @Override
    public void select() {
        super.select();
        System.out.println("jifen="+jifen);
    }
}
