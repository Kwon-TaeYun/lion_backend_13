package tv;

public class TVFactory {
    public static TV getTV(String tvName){
        TV tv = null;
        if("stv".equalsIgnoreCase(tvName)){
            tv = new STV();
        }else {
            tv = new LTV();
        }

        return tv;
    }
}
