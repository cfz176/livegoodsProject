package cfz.com.livegoods;

import java.util.Objects;

/**
 * 轮播图实体
 */
public class entity {

    private String id;
    private String img; // 轮播图地址
    private String groupId; // fastDfs组名
    private String fileId; // fastDfs文件名称
    private String serverUrl; // fastDfs Storage所在位置
    private String fileName; // 原文件名称

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        entity entity = (entity) o;
        return Objects.equals(id, entity.id) &&
                Objects.equals(groupId, entity.groupId) &&
                Objects.equals(fileId, entity.fileId) &&
                Objects.equals(serverUrl, entity.serverUrl) &&
                Objects.equals(fileName, entity.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupId, fileId, serverUrl, fileName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return "http://" + serverUrl +"/" + groupId + "/" + fileId;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
