package com.example.callapi.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Data {

    private int id;

    @SerializedName("user_id")
    private int userId;

    @SerializedName("device_id")
    private int deviceId;

    private int type;

    @SerializedName("pip_id")
    private String pipId;

    @SerializedName("wait_time")
    private int waitTime;

    @SerializedName("ip_server")
    private String ipServer;

    @SerializedName("client_ip")
    private String clientIp;

    private DataFile data;

    @SerializedName("server_name")
    private String serverName;

    @SerializedName("process_time")
    private float processTime;

    private int status;

    private Value value;

    private String error;

    @SerializedName("created_at")
    private String createAt;

    @SerializedName("updated_at")
    private String updated_ad;

    public Data(int id, int userId, int deviceId, int type, String pipId, int waitTime, String ipServer, String clientIp, DataFile data, String serverName, float processTime, int status, Value value, String error, String createAt, String updated_ad) {
        this.id = id;
        this.userId = userId;
        this.deviceId = deviceId;
        this.type = type;
        this.pipId = pipId;
        this.waitTime = waitTime;
        this.ipServer = ipServer;
        this.clientIp = clientIp;
        this.data = data;
        this.serverName = serverName;
        this.processTime = processTime;
        this.status = status;
        this.value = value;
        this.error = error;
        this.createAt = createAt;
        this.updated_ad = updated_ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPipId() {
        return pipId;
    }

    public void setPipId(String pipId) {
        this.pipId = pipId;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public String getIpServer() {
        return ipServer;
    }

    public void setIpServer(String ipServer) {
        this.ipServer = ipServer;
    }

    public DataFile getData() {
        return data;
    }

    public void setData(DataFile data) {
        this.data = data;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public float getProcessTime() {
        return processTime;
    }

    public void setProcessTime(float processTime) {
        this.processTime = processTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public String getUpdated_ad() {
        return updated_ad;
    }

    public void setUpdated_ad(String updated_ad) {
        this.updated_ad = updated_ad;
    }


    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String toJson(){
        Gson gson=new Gson();
        return gson.toJson(this);
    }
}
