package org.guanzon.appdriver.iface;

import org.json.simple.JSONObject;

public interface GTranDet extends GTransaction{
    int getItemCount();
    Object getDetailModel();
    JSONObject setDetail(int fnRow, int fnCol, Object foData);
    JSONObject setDetail(int fnRow, String fsCol, Object foData);
    JSONObject searchDetail(int fnRow, String fsIndex, String fsValue, boolean fbIsExact);
    JSONObject searchDetail(int fnRow, int fnIndex, String fsValue, boolean fbIsExact);
}