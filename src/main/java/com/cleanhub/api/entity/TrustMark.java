package com.cleanhub.api.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TrustMark implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uuid;

    @Lob
    String directLink;

    @Lob
    String thumbnailDirectLink;

    String fileName;

    Integer size;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the directLink
     */
    public String getDirectLink() {
        return directLink;
    }

    /**
     * @param directLink the directLink to set
     */
    public void setDirectLink(String directLink) {
        this.directLink = directLink;
    }

    /**
     * @return the thumbnailDirectLink
     */
    public String getThumbnailDirectLink() {
        return thumbnailDirectLink;
    }

    /**
     * @param thumbnailDirectLink the thumbnailDirectLink to set
     */
    public void setThumbnailDirectLink(String thumbnailDirectLink) {
        this.thumbnailDirectLink = thumbnailDirectLink;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the size
     */
    public Integer getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Integer size) {
        this.size = size;
    }

}
