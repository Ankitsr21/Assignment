class Example2 implements AutoCloseable {
    void show1(){
        System.out.println("inside show1"); }
    public void close(){
        System.out.println("close from Example2");
    }
}