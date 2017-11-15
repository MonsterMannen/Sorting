public class MonkeySort {
    public int[] sort(int[] array){
        while(!isSorted(array)){
            array = shuffle(array);
        }
        return array;
    }

    private boolean isSorted(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]) return false;
        }
        return true;
    }

    private int[] shuffle(int[] array){
        int rand = 0;
        for(int i = 0; i < array.length; i++){
            rand = (int)(Math.random() * array.length);

            // swap
            int temp = array[i];
            array[i] = array[rand];
            array[rand] = temp;
        }
        return array;
    }

    public int[] stringToIntArray(String[] array){
        int[] intArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            intArray[i] = Integer.parseInt(array[i]);
        }
        return intArray;
    }

    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // main
    public static void main(String[] args){
        MonkeySort ms = new MonkeySort();
        ms.printArray(ms.sort(ms.stringToIntArray(args)));
    }
}
