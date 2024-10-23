package com.panpan.basics;

/**
 * @author panpan
 * @create 2024-08-22-下午 02:51
 */
public abstract class Table {

    public void print(){
        System.out.println("table looks like beauty");
    }


    public  abstract  void use();/*{
        System.out.println("table using nice");
    }*/
}

class hightTable extends Table{

    @Override
    public void use() {
        System.out.println("hightTable using nice");
    }

}

class tableTest{
    public static void main(String[] args) {
        Table table=new Table() {
            @Override
            public void use() {
                System.out.println("其实桌子也很好的");
            }
        };
        table.use();
    }
}