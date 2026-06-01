public class test {

    public static void main(){
        PC pc_1 = new PC("1");
        System.out.println(pc_1.getStatus());

        pc_1.setOn();
        System.out.println(pc_1.getStatus());

        pc_1.setMax();
        System.out.println(pc_1.getStatus());
        System.out.print(pc_1.Power());
    }
    
}
