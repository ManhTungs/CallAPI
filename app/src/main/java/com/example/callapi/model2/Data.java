package com.example.callapi.model2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("device_id")
    @Expose
    private Integer deviceId;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("pip_id")
    @Expose
    private String pipId;
    @SerializedName("wait_time")
    @Expose
    private Integer waitTime;
    @SerializedName("ip_server")
    @Expose
    private String ipServer;
    @SerializedName("client_ip")
    @Expose
    private String clientIp;
    @SerializedName("data")
    @Expose
    private Data__1 data;
    @SerializedName("server_name")
    @Expose
    private String serverName;
    @SerializedName("process_time")
    @Expose
    private Double processTime;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("value")
    @Expose
    private Value value;
    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPipId() {
        return pipId;
    }

    public void setPipId(String pipId) {
        this.pipId = pipId;
    }

    public Integer getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(Integer waitTime) {
        this.waitTime = waitTime;
    }

    public String getIpServer() {
        return ipServer;
    }

    public void setIpServer(String ipServer) {
        this.ipServer = ipServer;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public Data__1 getData() {
        return data;
    }

    public void setData(Data__1 data) {
        this.data = data;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Double getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Double processTime) {
        this.processTime = processTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}