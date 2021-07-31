package data;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Orders {
    private final String id;
    private final Date date;

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", date=" + date +
                '}';
    }

    public Orders(String id, String date) {
        this.id = id;
        date = date.replace('T',' ');
        Date date1 = null;
        if(date.length()==19) {
            try {
                date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            try {
                date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        this.date = date1;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}
