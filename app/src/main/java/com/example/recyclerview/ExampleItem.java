package com.example.recyclerview;

import com.neovisionaries.bluetooth.ble.advertising.ADStructure;
import java.net.URL;
import java.util.UUID;

public class ExampleItem extends ADStructure {
    private String mhashcode, mdevicename, mdeviceaddress, mdevicerssi, mrawdata;
    private int mmajor, mminor, mpower, mpower1, mpower2, mpower3, mversion, mvoltage;
    private float mtemperature;
    private byte[] mnamespaceId;
    private byte[] minstanceId;
    private byte[] mbeaconId;
    private byte[] meid;
    private long mcount, melapsed;
    private UUID muuid;
    private URL murl;
    private boolean mf1,mf2,mf3,mf4,mf5;
    int type;


    public ExampleItem() {

    }


    public ExampleItem(String hashcode, String devicename, String deviceaddress, String devicerssi, String rawdata, UUID uuid, int major, int minor, int power, int power1, int power2, int power3, int version,
                       int voltage, float temperature, byte[] namespaceId, byte[] instanceId, byte[] beaconId, byte[] eid, long count, long elapsed, URL url,
                       boolean f1,  boolean f2,  boolean f3,  boolean f4,  boolean f5 ) {
        mhashcode = hashcode;
        mdevicename = devicename;
        mdeviceaddress = deviceaddress;
        mdevicerssi = devicerssi;
        mrawdata = rawdata;

        mf1 = f1;
        mf2 = f2;
        mf3 = f3;
        mf4 = f4;
        mf5 = f5;

        muuid = uuid;
        mmajor = major;
        mminor = minor;
        mpower = power;

        mpower1 = power1;
        mnamespaceId = namespaceId;
        minstanceId = instanceId;
        mbeaconId = beaconId;

        mpower2 = power2;
        murl = url;

        mversion = version;
        mvoltage = voltage;
        mtemperature = temperature;
        mcount = count;
        melapsed = elapsed;

        mpower3 = power3;
        meid = eid;

    }


    public String getMrawdata() {
        return mrawdata;
    }

    public void setMrawdata(String mrawdata) {
        this.mrawdata = mrawdata;
    }

    public String getMhashcode() {
        return mhashcode;
    }

    public void setMhashcode(String mhashcode) {
        this.mhashcode = mhashcode;
    }

    public String getMdevicename() {
        return mdevicename;
    }

    public void setMdevicename(String mdevicename) {
        this.mdevicename = mdevicename;
    }

    public String getMdeviceaddress() {
        return mdeviceaddress;
    }

    public void setMdeviceaddress(String mdeviceaddress) {
        this.mdeviceaddress = mdeviceaddress;
    }

    public String getDevicerssi() {
        return mdevicerssi;
    }

    public void setDevicerssi(String devicerssi) {
        this.mdevicerssi = devicerssi;
    }

    public int getMmajor() {
        return mmajor;
    }

    public void setMmajor(int mmajor) {
        this.mmajor = mmajor;
    }

    public int getMminor() {
        return mminor;
    }

    public void setMminor(int mminor) {
        this.mminor = mminor;
    }

    public int getMpower() {
        return mpower;
    }

    public void setMpower(int mpower) {
        this.mpower = mpower;
    }

    public UUID getMuuid() {
        return muuid;
    }

    public void setMuuid(UUID muuid) {
        this.muuid = muuid;
    }

    public int getMpower1() {
        return mpower1;
    }

    public void setMpower1(int mpower1) {
        this.mpower1 = mpower1;
    }

    public int getMpower2() {
        return mpower2;
    }

    public void setMpower2(int mpower2) {
        this.mpower2 = mpower2;
    }

    public int getMpower3() {
        return mpower3;
    }

    public void setMpower3(int mpower3) {
        this.mpower3 = mpower3;
    }

    public int getMversion() {
        return mversion;
    }

    public void setMversion(int mversion) {
        this.mversion = mversion;
    }

    public int getMvoltage() {
        return mvoltage;
    }

    public void setMvoltage(int mvoltage) {
        this.mvoltage = mvoltage;
    }

    public float getMtemperature() {
        return mtemperature;
    }

    public void setMtemperature(float mtemperature) {
        this.mtemperature = mtemperature;
    }

    public String getMnamespaceId() {
        return String.valueOf(mnamespaceId);
    }

    public void setMnamespaceId(byte[] mnamespaceId) {
        this.mnamespaceId = mnamespaceId;
    }

    public String getMinstanceId() {
        return String.valueOf(minstanceId);
    }

    public void setMinstanceId(byte[] minstanceId) {
        this.minstanceId = minstanceId;
    }

    public String getMbeaconId() {
        return String.valueOf(mbeaconId);
    }

    public void setMbeaconId(byte[] mbeaconId) {
        this.mbeaconId = mbeaconId;
    }

    public String getMeid() {
        return String.valueOf(meid);
    }

    public void setMeid(byte[] meid) {
        this.meid = meid;
    }

    public long getMcount() {
        return mcount;
    }

    public void setMcount(long mcount) {
        this.mcount = mcount;
    }

    public long getMelapsed() {
        return melapsed;
    }

    public void setMelapsed(long melapsed) {
        this.melapsed = melapsed;
    }

    public URL getMurl() {
        return murl;
    }

    public void setMurl(URL murl) {
        this.murl = murl;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isMf1() {
        return mf1;
    }

    public void setMf1(boolean mf1) {
        this.mf1 = mf1;
    }

    public boolean isMf2() {
        return mf2;
    }

    public void setMf2(boolean mf2) {
        this.mf2 = mf2;
    }

    public boolean isMf3() {
        return mf3;
    }

    public void setMf3(boolean mf3) {
        this.mf3 = mf3;
    }

    public boolean isMf4() {
        return mf4;
    }

    public void setMf4(boolean mf4) {
        this.mf4 = mf4;
    }

    public boolean isMf5() {
        return mf5;
    }

    public void setMf5(boolean mf5) {
        this.mf5 = mf5;
    }
}
