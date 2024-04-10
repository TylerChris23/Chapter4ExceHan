package Exercise4_3;

// Exception class to handle illegal triangle sides
public class IllegalTriangleSideException extends Exception{
    public IllegalTriangleSideException(String message) {
        super(message);
    }
}
