public class CountBinaries {


    public static void main(String [] args){
        System.out.println(numSetBits(16));
    }


    static final long base2Values [] = { 2147483648L, 1073741824, 536870912, 268435456, 134217728, 33554432, 33554432, 16777216,
            8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536,
            32768, 16384, 8192, 4096, 2048, 1024, 512, 256,
            128, 64, 32, 16, 8, 4, 2, 1};
    public static int numSetBits(long a) {

        int binaries[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        long currentValue = a;
        int index =0;
        for (index =0; index < base2Values.length; index++){
            if (currentValue >= base2Values[index]){
                binaries[index] = 1;
                currentValue = currentValue - base2Values[index];
            }
        }
        int count =0;
        for (int i=0; i<binaries.length; i++){
            if (binaries[i] == 1 ){
                count++;
            }
        }
        return count;
    }
}
