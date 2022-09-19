public class WaterStore {
    // פעולות גישה רק למונה, מכיוון שאנחנו רוצים לשנות אותו רק מבפנים, ואין סיבה לשנות או לגשת למערך מבחוץ. אם ירצו מספר דליים בשימוש ישתמשו בgetBucketCounter
    private Bucket[] buckets;
    private int bucketCounter;

    public WaterStore() {
        this.bucketCounter = 0;
        this.buckets = new Bucket[10];
        for (int i = 0; i < this.buckets.length; i++) {
            this.buckets[i] = null;
        }
    }

    public int getBucketCounter() { return bucketCounter; }

    public boolean addBucket(Bucket b) {
        if (bucketCounter < buckets.length) {
            buckets[bucketCounter] = b;
            bucketCounter++;
            return true;
        }
        return false;
    }

    public boolean deleteBucket(int amount, int capacity) {
        for (int i = 0; i < bucketCounter; i++) {
            if (buckets[i].getAmount() == amount && buckets[i].getCapacity() == capacity) {
                for ( int j = i; j < bucketCounter - 1; j++) {
                    buckets[j] = buckets[j + 1];
                }
                buckets[bucketCounter - 1] = null;
                bucketCounter--;
                return true;
            }
        }
        return false;
    }

    public Bucket findBucket(String color) {
        for (int i = 0; i < bucketCounter; i++) {
            if (buckets[i].getColor().equals(color)) {
                return buckets[i];
            }
        }
        return null;
    }

    public String toString() {
        String str = "Water Store: \n";
        for (int i = 0; i < bucketCounter; i++) {
            str += "  " + (i+1) + ") " + buckets[i].toString() + "\n";
        }
        return str;
    }
}
