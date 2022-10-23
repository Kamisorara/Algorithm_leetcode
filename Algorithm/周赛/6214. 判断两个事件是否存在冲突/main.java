import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        try {
            Date d1 = sdf.parse(event1[0]);
            Date d2 = sdf.parse(event1[1]);
            Date d3 = sdf.parse(event2[0]);
            Date d4 = sdf.parse(event2[1]);

            if (d1.compareTo(d4) > 0 || d2.compareTo(d3) < 0) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}