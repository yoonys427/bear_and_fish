public class Return {
    public static void main(String args[]) {
        String name = "윤영식";
        String name2 = callMyName2(name);
        System.out.println(name2);
    }
    
    public static void callMyName(String name) {
        System.out.println(name);
    }
    
    public static String callMyName2(String name) {
        return name+"입니다";
    }
}