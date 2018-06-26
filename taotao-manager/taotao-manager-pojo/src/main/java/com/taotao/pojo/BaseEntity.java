package com.taotao.pojo;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author：盛年华
 * @Date：2018/6/26 15:26
 * @Description:
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    private Long id;

    @Column(name="create_time")
    private Date created;

    @Column(name = "update_time")
    private Date updated;

    @Column(name = "status")
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
