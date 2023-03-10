sealed interface myInterface1 permits Ques12, Q1{
    public int message();

}

record Ques12() implements myInterface1 {
    public int message(){
        return 1;
    }
}
record Q1() implements myInterface1{
    public int message(){
        return 11;
    }
}
