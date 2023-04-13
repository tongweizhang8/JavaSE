package service;

/**自定義異常類
 *
 */
public class TeamException extends Exception {
    static final long serialVersionUID = -33578943247832L;
    public TeamException(){
        super();
    }
    public TeamException(String message){
        super(message);
    }
}
