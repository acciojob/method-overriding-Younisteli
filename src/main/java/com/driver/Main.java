package com.driver;

public class Main {
    public  static  void main(string[] args){
        B obj = new B();
        obj.meth();
    }

}
class A{
    public  String meth(){
        return "Invoking method from class A";
    }
}
class B extends  A{
    public String meth(){
        super.meth();
        return "Method is overridden in Extendend class B";
    }
}