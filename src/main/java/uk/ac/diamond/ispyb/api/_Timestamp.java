package uk.ac.diamond.ispyb.api;

import java.sql.Timestamp;

public class _Timestamp extends java.sql.Timestamp {
    public _Timestamp(int year, int month, int date, int hour, int minute, int second, int nano) {
        super(year, month, date, hour, minute, second, nano);
    }

    public _Timestamp(long time) {
        super(time);
    }

    public static _Timestamp valueOf(String time){
        return (_Timestamp) Timestamp.valueOf(time);
    }

    @Override
    public boolean equals(Timestamp ts) {
        return this.toString().equals(ts.toString());
    }

    public boolean equals(_Timestamp ts) {
        return equals((Timestamp) ts);
    }

    public boolean equals(Object ts) {
        return (ts instanceof Timestamp && this.equals((Timestamp) ts));
    }
}
