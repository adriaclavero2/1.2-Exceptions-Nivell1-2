public class EmptySaleException extends Exception{
    public EmptySaleException(){
        super("To make a sale, first add products.");
    }
}
