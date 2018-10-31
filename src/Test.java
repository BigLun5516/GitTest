import java.util.Iterator;
import java.util.Vector;

class Block{
    int a;
    public void print(){
        System.out.println("Block");
    }

}

class LBlock extends Block{
    int b;

    @Override
    public void print() {
        System.out.println("LBlock");
    }
}

public class Test {
    public void stop() throws Exception{
        throw new Exception();
    }


    public static void main(String[] args) {
        Vector<Integer> ints = new Vector<>();

        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        Integer i3 = new Integer(3);

        ints.add(i1);
        ints.add(i2);
        ints.add(i3);

        Iterator<Integer> it = ints.iterator();

        while(it.hasNext()){
            Integer temp = it.next();
            if(temp.intValue() == 2){
                it.remove();
            } else {
                System.out.println(temp.intValue());
            }
        }

        for (Integer temp : ints) {
            System.out.println(temp.intValue());
        }

        ints.clear();
        System.out.println("size:" + ints.size());
        System.out.println("capacity:" + ints.capacity());
    }
}
