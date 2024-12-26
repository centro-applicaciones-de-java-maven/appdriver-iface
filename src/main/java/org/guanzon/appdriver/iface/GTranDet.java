package org.guanzon.appdriver.iface;

public interface GTranDet extends GTransaction{
    int getDetailCount();
    Object getDetail(int row);
}