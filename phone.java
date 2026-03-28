public class phone {
    String brand ="apple";
    String moodle ="17 pro max";

    void call(){
        System.out.print("calling from iphone");
          
    
    }
    void message(){
        System.out.println("messageing from"+this.modle);
    }
    public static void main(String[] args) {
          
        phone p1 =new phone();
         
        p1.call();
        p1.message();
    }
}
