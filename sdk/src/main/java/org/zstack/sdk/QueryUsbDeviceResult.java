package org.zstack.sdk;

public class QueryUsbDeviceResult {
    public java.util.List<UsbDeviceInventory> inventories;
    public void setInventories(java.util.List<UsbDeviceInventory> inventories) {
        this.inventories = inventories;
    }
    public java.util.List<UsbDeviceInventory> getInventories() {
        return this.inventories;
    }

    public java.lang.Long total;
    public void setTotal(java.lang.Long total) {
        this.total = total;
    }
    public java.lang.Long getTotal() {
        return this.total;
    }

}
