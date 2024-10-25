package datastructure.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(50_000);
    }

}
