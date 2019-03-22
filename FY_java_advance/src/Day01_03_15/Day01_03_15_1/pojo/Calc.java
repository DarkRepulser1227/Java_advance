package Day01_03_15.Day01_03_15_1.pojo;

public class Calc {
    public int add(int a,int b){
        return a+b;
    }

    public float add(float a,float b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }

    //计算面积的功能
    public void getArea(double r){
        System.out.println("圆的面积为:"+Math.PI*r*r);

    }
    public void getArea(double a,double b){
        System.out.println("矩形的面积为:"+(a*b));
    }
    public void getArea(double a,double b,double h){
        System.out.println("梯形的面积为:"+(0.5*(a+b)*h));
    }
}
