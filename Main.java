public class Main {
    public static void main(String[] args) {
        Bucket b1 = new Bucket(500, "black");
        Bucket b2 = new Bucket(1000, "green", 750);
        Bucket b3 = new Bucket(750, "yellow", 700);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
//        System.out.println("adding to b1 200ml: " + b1.addWater(200));
//        System.out.println(b1);
//        System.out.println("adding to b2 250ml: " + b2.addWater(250));
//        System.out.println(b2);
//        System.out.println("adding to b3 200ml: " + b3.addWater(200));
//        System.out.println(b3);
//        System.out.println(b1.compare(b2));
        WaterStore ws = new WaterStore();
        ws.addBucket(b1);
        ws.addBucket(b2);
        ws.addBucket(b3);
        System.out.println(ws);
        ws.deleteBucket(750, 1000);
        System.out.println(ws);
        System.out.println(ws.findBucket("yellow"));
    }
}