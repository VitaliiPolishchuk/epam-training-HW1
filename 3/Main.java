package third;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCountBitSpace((byte) 1));
        System.out.println(getCountBitSpace((short) 8));
        System.out.println(getCountBitSpace((int) 0));
        System.out.println(getCountBitSpace(Integer.MAX_VALUE));
        System.out.println(getCountBitSpace(-1));
        System.out.println(getCountBitSpace(1000L));
        System.out.println(getCountBitSpace(-1000L));
    }

    private static int getCountBitSpace(Number num){
        long numL = num.longValue();
        for(int i = getCountBit(num) - 1; i >= 0; --i) {
            if ((numL & (1L << i)) != 0) return i + 1;
        }
        return 0;
    }

    private static int getCountBit(Number num){
        if(num instanceof Byte) return Byte.SIZE;
        else if(num instanceof Short) return Short.SIZE;
        else if(num instanceof Integer) return Integer.SIZE;
        else return Long.SIZE;
    }
}


