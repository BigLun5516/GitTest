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

        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
            if(ints.get(i) == i2){
                ints.remove(i2);
                i--;
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
