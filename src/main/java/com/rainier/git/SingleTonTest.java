package com.rainier.git;

/**
 * @author cook
 * @date 2023/3/30 18:22
 * @email 3293336923@qq.com
 * @Description
 */
public class SingleTonTest {
    //   实现  单例模式  懒汉式
    public static void main(String[] args) {
        Bank   bank1  =  Bank.getInstance();
        Bank   bank2  =  Bank.getInstance();
        System.out.println( bank1== bank2);
    }

}

class    Bank{

    public    static    Bank    bank ;

    public    static   Bank     getInstance(){
        if (bank == null) {
            synchronized(Bank.class){
                if (bank == null) {
                      bank  =  new Bank();
                }
            }
        }
        return   bank;
    }
}