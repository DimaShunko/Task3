public class IndexOutOfBoundsException extends Exception{
    String msg;

    public IndexOutOfBoundsException(String msg){
        this.msg = msg;
        System.err.println("Ошибка: " + msg);
    }
}