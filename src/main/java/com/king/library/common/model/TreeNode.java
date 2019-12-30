package com.king.library.common.model;

/**
 * @date: 2019/12/30 16:10
 * @author: duanyong
 * @desc:
 */
public class TreeNode {
    private String id;
    private String text;
    private String parentId;
    private boolean checked;

    public TreeNode() {
    }

    public TreeNode(String id, String text,String parentId, boolean checked) {
        this.id = id;
        this.text = text;
        this.parentId = parentId;
        this.checked = checked;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
