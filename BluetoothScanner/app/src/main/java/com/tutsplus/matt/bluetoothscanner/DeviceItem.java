package com.tutsplus.matt.bluetoothscanner;

import android.bluetooth.BluetoothDevice;

/**
 * Created by Matt on 5/12/2015.
 */
public class DeviceItem {

    private String deviceName;
    private String address;
    private int type;
    private boolean connected;

    public String getDeviceName() {
        return deviceName;
    }

    public boolean getConnected() {
        return connected;
    }

    public String getAddress() {
        return address;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public DeviceItem(String name, String address, int type, String connected){
        this.deviceName = name;
        this.address = address;
        this.type = type;
        if (connected == "true") {
            this.connected = true;
        }
        else {
            this.connected = false;
        }
    }

    public String getTypeString() {
        switch (getType()) {
            case BluetoothDevice.DEVICE_TYPE_UNKNOWN: {
                return "unknown";
            }
            case BluetoothDevice.DEVICE_TYPE_CLASSIC: {
                return "classic";
            }
            case BluetoothDevice.DEVICE_TYPE_LE: {
                return "LE";
            }
            case BluetoothDevice.DEVICE_TYPE_DUAL: {
                return "dual";
            }
        }
        return "unknown";
    }
}
