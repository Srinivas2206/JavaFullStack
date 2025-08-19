public class GarbageCollection {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        System.out.println("Free Memory in JVM before garbage Collection: " + rs.freeMemory());

        rs.gc();
        System.out.println("Free Memory in JVM after Garbage Collection: " + rs.freeMemory());
    }
} 
