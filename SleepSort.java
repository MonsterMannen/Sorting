public class SleepSort {

    public void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            // new process
            Thread ps = new SleepProcess(array[i]);
            ps.start();
        }
    }

    public int[] stringToIntArray(String[] array){
        int[] intArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }

    // main
    public static void main(String[] args){
        SleepSort ss = new SleepSort();
        ss.sort(ss.stringToIntArray(args));
    }


    private class SleepProcess extends Thread {
        int value;

        public SleepProcess(int v){
            value = v;
        }

        public void run(){
            try{
                Thread.sleep(value * 100);
                System.out.print(value + " ");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
